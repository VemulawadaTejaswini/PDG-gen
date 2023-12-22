import java.util.*;
import java.io.*;
public class Main{
  static ArrayList<Integer> primes = new ArrayList<Integer>();
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
     sieve(3161);
      PrintWriter out = new PrintWriter(System.out);
      int n = Integer.parseInt(st.nextToken());
      long ans = 1;
     div = new int[n+1];
     div[1] = 1;
     for(int i = 2; i <= n; i++)
       ans += solve(i);
     out.println(ans);
      out.close();
   }
  static void sieve(int n){
    boolean prime[] = new boolean[n+1];
    for(int i = 0; i < n; i++)
      prime[i] = true;
    for(int p = 2; p*p <= n; p++){
      if(prime[p]){
        for(int i = p*p; i <= n; i+= p)
          prime[i] = false;
      }
    }
    for(int i = 2; i <= n; i++){
      if(prime[i])
        primes.add(i);
    }
  }
  static int[] div;
  static long solve(int n){
    int work = 0;
    for(int p:primes){
      if(n%p == 0){
        work = p;
      	break;
      }
    }
    if(work == 0){
      div[n] = 2;
      return (long)2*n;
    }
    else{
      int help = n/p;
      if(help%p == 0)
        div[n] = 2*div[help] - div[help/p];
      else
        div[n] = 2*div[help];
      return (long)div[n]*n;
    }
  }
}