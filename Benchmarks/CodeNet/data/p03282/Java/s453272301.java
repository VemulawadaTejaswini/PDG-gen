import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  String s = sc.next();
  char[] a = s.toCharArray();
  long n = sc.nextInt();
  boolean b = true;
  char c = 'a';
  out:
  for(int i = 0;i < s.length();i++){
    c = a[i];
    if(c != '1'){
      if(n < i+1){
        break out;
      }
      else{
      b = false;
      break out;
      }
    }
  }
  System.out.println(b? "1":c);
}}
      