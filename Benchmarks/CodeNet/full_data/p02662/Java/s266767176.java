import java.util.*;
import java.io.*;
public class Main {
	static int[] array;
	static ArrayList<Integer> allSubsets = new ArrayList<Integer>();
	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int n = Integer.parseInt(st.nextToken());
 		int s = Integer.parseInt(st.nextToken());
 		array = new int[n];
 		StringTokenizer st1 = new StringTokenizer(bf.readLine());
 		for(int i = 0;i<n;i++){
 			array[i] = Integer.parseInt(st1.nextToken());
 		}
 		
 		allSubsets(n-1, s, 0);
 		long sum =0;
 		for(int i = 0;i<allSubsets.size();i++){
 			sum+= power(2, n-allSubsets.get(i), num);
 			sum=sum%num;
 		}
 		out.println(sum);
 		out.close();
 		
 		
 		
 		
 		

	}
	public static void allSubsets(int i, int sum, int numIncluded){
		if (i == -1){
			if (sum == 0)
				allSubsets.add(numIncluded);
		}
		else if (sum == 0)
			allSubsets.add(numIncluded);
		else if (sum > 0){
			allSubsets(i-1, sum, numIncluded);
			allSubsets(i-1, sum-array[i], numIncluded+1);
		}
			
		
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

 		
 		
 		
 		
	


