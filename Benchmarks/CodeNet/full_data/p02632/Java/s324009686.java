import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 1000000007;
		long[] fact = new long[2000002];
 		fact[0] = 1;
 		long ans1 = 1;
 		for(int i = 1;i<=2000001;i++){
 			ans1= (ans1*i) % num;
 			fact[i] = ans1;
 		}
 		long[] inv = new long[2000002];
 		inv[0] = 1;
 		for(int i = 1;i<=2000001;i++){
 			inv[i] = power(fact[i], num-2, num)%num;
 		}
		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int k = Integer.parseInt(bf.readLine());
 		String s = bf.readLine();
 		long sum = 0;
 		for(int i = 0;i<=k;i++){
 			long prod = 1;
 			prod*= power(25, i, num);
 			prod%= num;
 			prod*= power(26, k-i, num);
 			prod%= num;
 			prod*= fact[i+s.length()-1];
 			prod%= num;
 			prod*= inv[i];
 			prod%= num;
 			prod*= inv[s.length()-1];
 			prod%= num;
 			sum+= prod;
 			sum%= num;
 		}
 				
 		
 		
 		out.println(sum);
	 		
 		out.close();
 		
 		
 		
 	}
	public static int power(long x, long y, long mod){
		long ans = 1;
		while(y>0){
			if (y%2==1)
				ans = (ans*x)%mod;
			x = (x*x)%mod;
			y/=2;
		}
		return (int)(ans);
	}
	
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


