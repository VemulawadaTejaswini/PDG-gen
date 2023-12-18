import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  String s = sc.next();
  if(s.length() == 4) {System.out.println("2");}
  if(s.length() > 4) {
  int ans = 0;
  for(int i = s.length()-3; i > 1; i -= 2) {
    if(s.substring(0, (i -1)/ 2).equals(s.substring((i+1) / 2 , i))) {
      ans = i;
      break;
    }
  }
  System.out.println(ans+1);
  }
}}
