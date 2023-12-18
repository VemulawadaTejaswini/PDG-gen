import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader in = new BufferedReader(new FileReader("prob.in"));
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("prob.out")));
		
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		
		int totalSum = 0;
		
		for(int i = 1; i <= N; i++){
			int curr = i;
			String str= "" + curr;
			
			int tempSum = 0;
			
			while(str.length() < 4){
				str = "0" + str;
			}
			
			
			for(int j =0; j < 4; j++){
				tempSum += Integer.parseInt("" + str.charAt(j));
			}
			
			if(tempSum >= A && tempSum <= B){
				//out.println(str);
				totalSum += curr;
			}
			
			
		}
		
		out.println(totalSum);
		
		
		
		
		in.close();
		out.close();
		
	}
}
