import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		String x = bf.readLine().trim();
 		int onecount = 0;
 		for(int i = 0;i<x.length();i++){
 			if (x.charAt(i) == '1')
 				onecount++;
 		}
 		long sumonem1 = 0;
 		long sumonep1 = 0;
 		for(int i = x.length()-1;i>=0;i--){
 			if (x.charAt(i) == '1'){
	 			sumonem1+= power(2, x.length()-1-i, onecount-1);
	 			sumonem1%= (onecount-1);
	 			sumonep1+= power(2, x.length()-1-i, onecount+1);
	 			sumonep1%= (onecount+1);
 			}
 		}
 		
 		for(int i = 0;i<x.length();i++){
 			
 			long sum = 0;
 			if (x.charAt(i) == '1'){
 				sum = sumonem1;
 				sum -= power(2, x.length()-1-i, onecount-1);
 				sum%= (onecount-1);
 				sum+= (onecount-1);
 				sum%= (onecount-1);
 				int count = 1;
 				while(sum!= 0){
 					String a = Long.toBinaryString(sum);
 					long counta = 0;
 					for(int j=0;j<a.length();j++){
 						if (a.charAt(j) == '1')
 							counta++;
 					}
 					sum = sum%counta;
 					count++;
 				}
 				out.println(count);
 			}
 			else{
 				sum = sumonep1;
 				sum+= power(2, x.length()-1-i, onecount+1);
 				sum%= (onecount+1);
 				sum+= (onecount+1);
 				sum%= (onecount+1);
 				int count = 1;
 				while(sum!= 0){
 					String a = Long.toBinaryString(sum);
 					long counta = 0;
 					for(int j=0;j<a.length();j++){
 						if (a.charAt(j) == '1')
 							counta++;
 					}
 					sum = sum%counta;
 					count++;
 				}
 				out.println(count);
 			}
 		}
 		
 		
 		
 		
 		out.println();
	 		
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

 		
 		
 		
 		
	


