import java.io.*;
import java.util.*;

public class Main {
	static public void main(String [] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> que = new PriorityQueue<Integer>(10,new Comp());
		while (true){
			StringTokenizer st=new StringTokenizer(br.readLine());
			String str=st.nextToken();
			if (str.equals("insert")){
				que.add(Integer.parseInt(st.nextToken()));
			}else if (str.equals("extract")){
				System.out.println(que.poll());
			}else if (str.equals("end")) System.exit(0);
		}
	}
	private static class Comp implements Comparator<Integer>{
        public int compare(Integer x,Integer y){
            return (x < y) ? 1 : ((x == y) ? 0 : -1);
        }
    }
		
}