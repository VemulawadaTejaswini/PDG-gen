import java.util.*;
 
public class Main{
  public static int[] dp;
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    
    double[] table = new double[N+1];
    table[0] = 0.0;
    
    double a = 1.0/N;
    for(int i = 1; i <= N; i++){
      int k = i;
      int b = 1;
      boolean check = true;
      while(check){
        if(k < K){
          k *= 2;
          b *= 2;
        }else{
          check = false;
      	}
      }
      table[i] = a * (1.0/b);
    }
    
    double ans = 0.0;
    for(int i = 0; i <= N; i++){
      ans += table[i];
    }
    
    System.out.println(ans);
  }
}