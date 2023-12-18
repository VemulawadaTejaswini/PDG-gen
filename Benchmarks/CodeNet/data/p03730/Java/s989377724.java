import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  boolean b = false;
  for(int i = 0;i < a*b;i += a){
    if(i%b == c){
      b = true;
      break
    }
  }
  if(b)System.out.println("YES");
  else System.out.println("NO");
}}