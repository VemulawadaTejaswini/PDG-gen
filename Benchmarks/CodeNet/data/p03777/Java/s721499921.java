import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	String a = sc.next();
    String b = sc.next();
    if (a.equals(b)) {
      System.out.println("H");
    } else {
      System.out.println("D");
    }
  }
}