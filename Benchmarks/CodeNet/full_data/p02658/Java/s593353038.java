import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
      int N =sc.nextInt();
      long A[] = new long[N];
      boolean f = false;
      for(int i=0;i<N;i++){
        A[i] = sc.nextLong();
        if(A[i]>(long)Math.pow(10,18)) f = true;
      }
      Arrays.sort(A);
      long ans = 1;
      for(int i=0;i<N;i++){
        ans*=A[i];
        if(ans==0) break;
        if(ans>(long)Math.pow(10,18)||f){
          f = true;
          ans = -1;
          break;
        }
      }
      System.out.println(f ? "-":ans);
	}
}