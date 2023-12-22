import java.util.*;
import java.io.*;
public class Mode {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = 0;
		}
		while(line != null) {
			StringTokenizer tk = new StringTokenizer(line);
			int n = Integer.parseInt(tk.nextToken());
			arr[n]++;
			line = in.readLine();
		}
		LinkedList<Integer> l = new LinkedList<Integer>();
		int mode = 0;
		for (int i = 0; i < 100; i++) {
			if (arr[i] == mode) {
				l.add(i+1);
			}
			else if(arr[i] > mode){
				l = new LinkedList<Integer>();
				l.add(i+1);
				mode = arr[i];
			}
		}
		while(!l.isEmpty()) {
			System.out.println(l.remove());
		}
	}
}