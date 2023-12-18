import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();

    sc.close();

    String result = "No";

    if (N % 4 == 0 || N % 7 == 0 || N % 11 == 0){
      result = "Yes";
    }
    
    if (result.equals("No")){

      for (int i = 1; i <= N / 4; i++) {
        if((N - (4 * i)) % 7 == 0 ) {
          result = "Yes";
          break;
        }
      }

    }

    if (result.equals("No")){

      for (int i = 1; i <= N / 7; i++) {
        if((N - (7 * i)) % 4 == 0 ) {
          result = "Yes";
          break;
        }
      }

    }

    System.out.println(result);

  }

}