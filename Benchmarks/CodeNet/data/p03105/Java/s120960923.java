import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int cnt = 0;
    while(C > cnt && B >= A){
      B -= A;
      cnt++;
    }

    System.out.println(cnt);

  }
}
