import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  boolean d = false;
  for(int i = 0;i < a*b;i += a){
    if(i%b == c){
      d = true;
      break;
    }
  }
  if(d)System.out.println("YES");
  else System.out.println("NO");
}}
