import java.util.*;

public class Main{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;

    for(int i = n;i > 0;i--) {

      if(String.valueOf(i).length() % 2 != 0) {
        count++;
      }

    }

    System.out.println(count);


  }

}
