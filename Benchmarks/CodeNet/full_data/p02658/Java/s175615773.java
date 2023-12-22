import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    long a[n] = new long[n];
    long sum = 1;
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
      sum *= a[i];
    }
    
    if(sum > 1000000000000000000){
      System.out.println(-1);
    }else{
      System.out.println(sum);
    }
  }
}