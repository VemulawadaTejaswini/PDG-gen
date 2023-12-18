import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] p = new int[n];
    for(int i=0; i<n; ++i)
      p[i] = sc.nextInt();
    int ans = 0;
    int min = p[0];
    for(int i=0; i<n; ++i){
      if(p[i] <= min){
        min = p[i];
        ++ans;
      }
    }
    System.out.println(ans);
  }
}