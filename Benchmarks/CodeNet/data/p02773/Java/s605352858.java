import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int N = sc.nextInt();
      String[] S = new String[N];
      TreeMap<String,Integer> map = new TreeMap<>();
      int max = 0;
      for(int i=0;i<N;i++){
        S[i] = sc.next();
        if(map.containsKey(S[i])){
          map.put(S[i],map.get(S[i])+1);
        }else{
          map.put(S[i],1);
        }
        if(max < map.get(S[i])){
          max=map.get(S[i]);
        }
      }
      for(String tan:map.keySet()){
        if(map.get(tan)==max){
          System.out.println(tan);
        }
        
      }
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
