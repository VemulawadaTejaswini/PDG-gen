import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		Job[] jobs = new Job[n];
		for(int i = 0; i < n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			jobs[i] = new Job(a, b);
		}
		Arrays.sort(jobs);
		int curr = Integer.MAX_VALUE;
		for(int i = n-1; i >= 0; i--){
			curr = Integer.min(jobs[i].b, curr) - jobs[i].a;
		}
		if(curr >= 0) System.out.println("Yes");
		else System.out.println("No");
	}
	static class Job implements Comparable<Job>{
		int a, b;
		public Job(int a, int b){
			this.a = a; this.b = b;
		}
		@Override
		public int compareTo(Job p){
			return b - p.b;
		}
		public String toString(){
			return a+" "+b;  
		}
	}
}
