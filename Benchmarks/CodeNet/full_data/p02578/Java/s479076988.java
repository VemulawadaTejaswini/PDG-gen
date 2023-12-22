import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] A = new int[N];
      int ans = 0;
      for(int i=0;i<N;i++){
        A[i] = sc.nextInt();
        if(i>0 && A[i]<A[i-1]){
          ans+=A[i-1]-A[i];
          A[i] = A[i-1];
        }
      }
        System.out.println(ans);
    }
}