import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  HashSet<String> hs = new HashSet<String>();
  boolean ok = true;
  String a = sc.next();
  String b = "";
  hs.add(a);
  for(int i = 0;i < n-1;i++){
    b = sc.next();
    if(hs.contains(b)){
      ok = false;
      break;
    }
    char[] ac = a.toCharArray();
    char[] bc = b.toCharArray();
    if(ac[ac.length - 1] != bc[0]){
      ok = false;
      break;
    }
    hs.add(b);
    a = b;
  }
  System.out.println(ok? "Yes":"No");
}}