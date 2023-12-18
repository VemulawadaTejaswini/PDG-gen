import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] H = new int[N];
      for(int i=0;i<N;i++){
        H[i] = sc.nextInt();
      }
      boolean[] check = new boolean[N];
      for(int i=0;i<N;i++){
        check[i] = true;
      }
      for(int i=0;i<M;i++){
        int A = sc.nextInt()-1;
        int B = sc.nextInt()-1;
        if(H[A]<=H[B]){
          check[A]=false;
        }if(H[A]>=H[B]){
          check[B]=false;
        }
      }
      int ans = 0;
      for(int i=0;i<N;i++){
        System.out.println(check[i]);
        if(check[i]){
          ans++;
        }
      } 
      System.out.println(ans);
    }
}