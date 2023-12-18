import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  String s = sc.next();
  char[] c = s.toCharArray();
  char[] d = new char[(s.length() + 1)/2];
  for(int i = 0;i < (s.length() + 1)/2;i++){
    d[i] = c[2*i];
  }
  String t = String.valueOf(d);
  System.out.println(t);
}}