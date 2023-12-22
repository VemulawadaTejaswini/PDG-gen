import java.util.*;
import java.io.*;
public class Main {
	static ArrayList<Long> primes;
	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		primes = new ArrayList<Long>();
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		long[] array = new long[n];
 		long gcd = array[0];
 		for(int j= 0 ;j<n;j++){
 			array[j] = Integer.parseInt(st.nextToken());
 			gcd = gcd(array[j], gcd);
 		}
 		boolean ans = true;
 		if (gcd == 1){
	 		sieveOfEratosthenes(1000001);
	 		
	 		Set<Long> p = new HashSet<Long>();
	 		for(int j =0;j<n;j++){
	 			for(long pr : primes){
	 				if (pr*pr > array[j]){
	 					break;
	 				}
	 				if (array[j]%pr == 0){
	 					if (p.contains(pr)){
	 						ans = false;
	 						break;
	 					}
	 					if (p.contains(array[j]/pr)){
	 						ans = false;
	 						break;
	 					}
	 					else{
	 						p.add(pr);
	 						p.add(array[j]/pr);
	 					}
	 				}
	 			}
	 			if (!ans)
	 				break;
	 		}
 		}
 		
 		if (gcd > 1)
 			out.println("not coprime");
 		else if (ans)
 			out.println("pairwise coprime");
 		else
 			out.println("setwise coprime");
	 		
 		out.close();
 		
 		
 		
 	}
	public static long gcd(long a, long b){ 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    }
	public static void sieveOfEratosthenes(int n) {  
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) { 
        	if(prime[p]){ 
                for(int i = p*p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
        for(int i = 2; i <= n; i++){ 
            if(prime[i] == true) 
                primes.add((long)(i));
        } 
    }
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


