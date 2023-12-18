import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  int d = sc.nextInt();
  if(a >= d || b <= c)System.out.println("0");
  else if(a <= c && d <= b)System.out.println(d-c);
  else if(c <= a && b <= d)System.out.println(b-a);
  else if(a <= c && c <= b && b <= d)System.out.println(b-c);
  else if(b <= a && a <= d && d <= c)System.out.println(d-a);
}}
