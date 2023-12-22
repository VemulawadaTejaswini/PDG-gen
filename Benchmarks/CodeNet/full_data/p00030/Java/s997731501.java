import java.util.Scanner;

public class Main{
  public static int n;
  public static int s;
  public static int count;
  public static int[] a = new int[10];

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    s = scanner.nextInt();
    count = 0;
    for (int i = 0; i < 10; i++)
      a[i] = i;

    dfs(0, 0, 0);
    System.out.println(count);
  }
  static void dfs(int i, int sum, int k){
    if(n > 0 && k == n && sum == s){
      count++;
    }
    if(i == 10 || k == n || sum > s){return;}

    dfs(i + 1, sum + a[i], k + 1);
    dfs(i + 1, sum, k);
  }
}
