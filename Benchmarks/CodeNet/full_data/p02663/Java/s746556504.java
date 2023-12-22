import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int h1 = sc.nextInt();
    int m1 = sc.nextInt();
    int h2 = sc.nextInt();
    int m2 = sc.nextInt();
    int k = sc.nextInt();

    int min = 0;
    int ans = 0;

    if(m2 > m1){
      min = (h2 - h1) * 60 + (m2 - m1);
    } else {
      min = (h2 - 1 - h1) * 60 + (m2 + 60 - m1);
    }

    ans = min - k;

    System.out.println(ans);
  }
}
