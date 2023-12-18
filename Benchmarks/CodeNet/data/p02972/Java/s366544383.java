import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      int[] a = new int[N];
      int[] sum = new int[N];
      Arrays.fill(sum, 0);
      int i=0;
      int j=0;
      for(i=0;i<N;i++){
        a[i] = sc.nextInt();
      }
      ArrayList<Integer> intList = new ArrayList<Integer>();
      for(i=N-1;i>=0;i--){
        if(a[i]==1&&sum[i]%2==0){
          intList.add(i+1);
          for(j=1;j<i;j++){
            if(i%j==0){
              sum[j]=sum[j]+1;
            }
          }
        }else if(sum[i]%2==1){
          intList.add(i+1);
          for(j=1;j<i;j++){
            if(i%j==0){
              sum[j]=sum[j]+1;
            }
          }
        }
      }
      System.out.println(intList.size());
      for(int k:intList){
        System.out.print(k+" ");
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