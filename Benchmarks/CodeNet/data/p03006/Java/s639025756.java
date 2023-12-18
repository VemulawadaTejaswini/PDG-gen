import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X[] = new int[N];
        int Y[] = new int[N];
        double Z[] = new double[N-1];
      
		double ma=0;double my =0;
        double ans =0;int cont = 0;
      
      
      for(int i=0;i<N;i++){
        X[i] = sc.nextInt();
        Y[i] = sc.nextInt();
      }
      
      for(int i= 0;i<N-1;i++){
        ma = Math.pow(X[i]-X[i+1], 2);
        my = Math.pow(Y[i]-Y[i+1], 2);
        ans = Math.sqrt(ma+my);
        Z[i] = ans;
      }
      Arrays.sort(Z);
      for(int i=0;i<N-2;i++){
        if(Z[i]!=Z[i+1]){cont++;}
      }
      
      System.out.print(cont+1);
      
      
      


      
    }
}