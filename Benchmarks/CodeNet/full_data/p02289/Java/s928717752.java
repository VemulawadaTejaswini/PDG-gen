import java.util.*;
import java.io.*;

class Main {

	static int size;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pQue = new PriorityQueue<Integer>(10,COMPARATOR);

		while (true) {
			String line = br.readLine();
			if (line.equals("end")){
				break;
			}else if (line.startsWith("insert")) {
				pQue.add(Integer.parseInt(line.substring(line.indexOf(" ")+1)));
			}else {
				System.out.println(pQue.poll());
			}

		}
	}

	public static final Comparator<Integer> COMPARATOR = new Comp();
	
	private static class Comp implements Comparator<Integer>{
		public int compare(Integer x,Integer y){
			return (x < y) ? 1 : ((x == y) ? 0 : -1);
		}
	}
}