import java.util.Scanner;
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String s = scan.next();
    for(int i = 0; i < s.length(); i ++){
      s.charAt(i) = s.charAt(i) + n;
      if(s.charAt(i) > Z){
        s.charAt(i) -= 25;
      }
    }
  }
}
