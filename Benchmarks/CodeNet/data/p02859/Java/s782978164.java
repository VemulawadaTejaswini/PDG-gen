import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();

    if (len%2 == 1){System.out.println("No");return;}

    String substr_former = str.substring(0, len/2);
    String substr_later = str.substring((len/2), len);

    if (substr_former.startsWith(substr_later)){
      System.out.println("Yes");
    }else {
      System.out.println("No");
    }

  }
}