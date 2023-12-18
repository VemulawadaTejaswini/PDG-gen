import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int a = sc.nextInt();
  int b = sc.nextInt();
  System.out.print(a >= b ? b:a);
  System.out.print(" ");
  int min = n - (a + b);
  System.out.println(0 <= min ? min:"0");
}}