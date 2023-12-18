import java.util.*;

public class Main{
  public static void mian(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    double A = sc.nextDouble();
    double min = 1000000;
    
    for(int i=0; i<N; i++){
      double H = sc.nextInt();
      double temp = T- H*0.006;
      double temp1 = Math.min(min, Math.abs(A-temp));
      if(min<temp1) min = temp1;
    }
    System.out.println(temp1);
  }
}