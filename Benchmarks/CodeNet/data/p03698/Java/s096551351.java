import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  String s = sc.next();
  char[] c = s.toCharArray();
  String[] t = new String[s.length()];
  for(int i = 0;i < s.length();i++){t[i] = String.valueOf(c[i]);}
  HashSet<String> hs = new HashSet<String>();
  for(int i = 0;i < s.length();i++){hs.add(t[i]);}
  if(hs.size()==t.length)System.out.println("yes");
  else System.out.println("no");
}}
    
