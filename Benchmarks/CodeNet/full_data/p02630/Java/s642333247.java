import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int[] freq = new int[100001];
 		int sum = 0;
 		for(int i = 0;i<n;i++){
 			int a= Integer.parseInt(st.nextToken());
 			freq[a]++;
 			sum+=a;
 		} 		
 		int q = Integer.parseInt(bf.readLine());
 		
 		for(int i =0 ;i<q;i++){
 			StringTokenizer st1 = new StringTokenizer(bf.readLine());
 			int a = Integer.parseInt(st1.nextToken());
 			int b = Integer.parseInt(st1.nextToken());
 			if (freq[a] == 0){
 				out.println(sum);
 			}
 			else{
 				sum = sum-a*freq[a]+b*freq[a];
 				out.println(sum);
 				freq[b]+=freq[a];
 				freq[a] = 0;
 				
 			}
 		}
 		out.close();
 		
 	}
}
 	