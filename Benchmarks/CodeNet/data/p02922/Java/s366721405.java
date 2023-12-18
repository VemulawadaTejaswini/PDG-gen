import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();

    int ans = 0;
    int c = 0;
    while (c < B) {
        if (c > 0) c--;
        c += A;
        ans++;
    }

    System.out.println(ans);
  }
}