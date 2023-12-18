import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  int d = sc.nextInt();
  int x = c-a;
  int y = d-b;
  int e = c-y;
  int f = d+x;
  int g = e-x;
  int h = f-y;
  System.out.println(e+" "+f+" "+g+" "+h);
}}
  