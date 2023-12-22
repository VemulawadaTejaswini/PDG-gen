import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int [] ls = new int[n];
    for (int i = 0; i < k; i++){
      int d = scan.nextInt();
      for (int j = 0; j < d; j++){
        int a = scan.nextInt();
        ls[a-1]++;
      }
    }
    int ans = 0;
    for (int i = 0; i < n; i++){
      if (ls[i] == 0){
        ans++;
      }
    }
    System.out.println(ans);
  }
}