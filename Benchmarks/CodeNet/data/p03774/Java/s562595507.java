import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] a = new int[N];
      int[] b = new int[N];
      int[] c = new int[M];
      int[] d = new int[M];
      for(int i=0;i<N;i++){
        a[i] = sc.nextInt();
        b[i] = sc.nextInt();
      }
      for(int i=0;i<M;i++){
        c[i] = sc.nextInt();
        d[i] = sc.nextInt();
      }
      for(int i=0;i<N;i++){
        int min = 2*100000000+1;
        int ans = 0;
        for(int j=0;j<M;j++){
          int man = (int)Math.abs(a[i]-c[j])+(int)Math.abs(b[i]-d[j]);
          if(man<min){
            min = man;
            ans = j+1;
          }
        }
        System.out.println(ans);
      }
    }
}