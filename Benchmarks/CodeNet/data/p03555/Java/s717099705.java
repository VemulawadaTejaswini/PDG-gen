
import java.util.Scanner;

class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String A = sc.next();
    String B = sc.next();

    if  (A.substring(0,1).equals(B.substring(2,3)) && A.substring(1,2).equals(B.substring(1,2)) && A.substring(2,3).equals(B.substring(0,1))){
      System.out.println("YES");
    }
    else {
      System.out.println("NO");
    }
  }
}
