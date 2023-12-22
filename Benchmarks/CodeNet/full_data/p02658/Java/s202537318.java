import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long ans = 1;

    for(int i=0; i<n; ++i)
      ans *= sc.nextLong();

    if(ans < 0 || ans > 1_000_000_000_000_000_000L)
      ans = -1;

    System.out.println(ans);

  }
}