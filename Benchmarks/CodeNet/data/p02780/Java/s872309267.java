import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] p = new int[n];
    for(int i = 0;i<n;i++)p[i]=sc.nextInt();
    double ki = 0.0;
    for(int i = 0;i<k;i++){
      ki += (double)(p[i]+1)/2;
    }
    double kita = ki;
    for(int i = k;i<n;i++){
      ki += (double)(p[i]+1)/2-(double)(p[i-k]+1)/2;
      kita = Math.max(ki,kita);
    }
    System.out.println(kita);
  }
}

