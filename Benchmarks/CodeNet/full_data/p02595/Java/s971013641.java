import java.util.Scanner;
 
public class Main {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
	  double[] X = new double[N];
      double[] Y = new double[N];
      double D = sc.nextDouble();
      int cnt = 0;
      
      for(int i=0; i<=N; i++) {
        X[i]=sc.nextDouble();
        Y[i]=sc.nextDouble();
        
        if(Math.sqrt(X[i]*X[i]+Y[i]*Y[i]) <= D) {
          cnt ++;
        } else {
          //cnt += 0;
          continue;
        }
      }
      System.out.println(cnt);
    }
}