import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		StringTokenizer line1 = new StringTokenizer(bf.readLine());
 		int sum1 = 0;
 		int sum2 = 0;
 		int[] array1 = new int[n];
 		for(int i = 0;i<n;i++){
 			array1[i] = Integer.parseInt(line1.nextToken());
 		}
 		for(int i = 0;i<n;i++){
 			sum1+=(array1[i]-1)*factorial(n-1-i);
 			for(int j = i+1;j<n;j++){
 				if (array1[j] > array1[i])
 					array1[j]--;
 			}
 		}
 		
 		StringTokenizer line2 = new StringTokenizer(bf.readLine());
 		int[] array2 = new int[n];
 		for(int i = 0;i<n;i++){
 			array2[i] = Integer.parseInt(line2.nextToken());
 		}
 		for(int i = 0;i<n;i++){
 			sum2+=(array2[i]-1)*factorial(n-1-i);
 			for(int j = i+1;j<n;j++){
 				if (array2[j] > array2[i])
 					array2[j]--;
 			}
 		}
 		out.println(Math.abs(sum1-sum2));
 		out.close();
 		
 		
 		
 		
 		
 	}
	public static int factorial(int n){
		int prod =1;
		while(n > 0){
			prod*=n;
			n--;
		}
		return prod;
	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


