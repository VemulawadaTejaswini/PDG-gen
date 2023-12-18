import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int tmp = 0;
    int max = 0;
    int[] p = new int[n];
    double ans = 0;
    for(int i = 0;i < n;i++){
      p[i] = sc.nextInt();
    }
    for(int j = 0;j <= n - k;j++){
      for(int x = 0;x < k;x++){
        tmp += p[j+x]; 
      }
      max = Math.max(max,tmp);
      tmp = 0;
    }
     max += k;
      ans = (double)(max * 0.5); 
    System.out.println(ans);
  }
}