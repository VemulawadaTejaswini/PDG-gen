import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
    String s = sc.next();
    if (s.length() <= a){
      System.out.println(s);
    } else {
      String t = s.substring(0,a);
      System.out.println(t + "...");
    }
  }
}