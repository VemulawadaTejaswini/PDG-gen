import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  String a = sc.next();
  String b = sc.next();
  if(a == "H")System.out.println(b);
  else if(a == "D" && b == "H")System.out.println("D");
  else System.out.println("H");
}
}
