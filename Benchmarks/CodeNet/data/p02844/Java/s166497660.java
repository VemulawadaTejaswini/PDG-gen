import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int N = sc.nextInt();
      String S = sc.next();
      String[] sA = new String[N];
      Map<String,Integer> map = new HashMap<>();
      Map<Integer,Integer> counts = new HashMap<>();
      int syurui=0;
      Map<String,Integer> syuruis = new HashMap<>();
      for(int i=0;i<N;i++){
        sA[i]=S.substring(i,i+1);
      }
      for(int j=N-1;j>1;j--){
        syuruis.put(sA[j],0);
        counts.put(j,syuruis.size());
      }
      int s1=0;
      int s2=1;
      int s3=2;
      long count = 0;
	  for(s1=0;s1<N-2;s1++){
        for(s2=s1+1;s2<N-1;s2++){
          if(!map.containsKey(sA[s1]+sA[s2])){
          	map.put(sA[s1]+sA[s2],0);
         	s3=s2+1;
          	count+=counts.get((int)s3);
          }
        }
      }

      System.out.println(count);
      

    }
  
  private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}
  
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}
