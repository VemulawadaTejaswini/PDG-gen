import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		// System.setIn(new FileInputStream("file"));
		try(BufferedReader  kb = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter out = new PrintWriter(System.out)){
			for(String in; (in= kb.readLine())!= null; ){
				int N = Integer.parseInt(in.trim());
				int[] arr = new int[N];
				int sum = 0;
				for(int i = 0; i < N ; i++){
					in = kb.readLine().trim();
					arr[i] = Integer.parseInt(in);
					sum +=arr[i]; 
				}
				out.println(solve(arr, sum));
			}
		}
	}

	static int solve(int[] arr, int sum) {
		int[] arr2 = new  int[sum];
		int c = 0;
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				arr2[c] = i+1;
				c++;
			}
		}
		for (int i = 0; i < arr2.length-1; i++) {
			if(arr2[i+1]-arr2[i] <=1) {
				a++;
				i++;
			}
		}
		return a;
	}
}