import java.util.*;
public class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner();
  int a = sc.nextInt();
  int b = sc.nextInt();
  String str = (a * b % 2 == 0)? "Yes":"No";
  System.out.println(str);
 }
}