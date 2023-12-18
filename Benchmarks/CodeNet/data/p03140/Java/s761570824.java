import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  String a = sc.next();
  String b = sc.next();
  String c = sc.next();
  char[] p = a.toCharArray();
  char[] q = b.toCharArray();
  char[] r = c.toCharArray();
  int ans = 0;
  for(int i = 0;i < n;i++){
    if(p[i] != q[i] && q[i] != r[i] && r[i] != p[i])ans += 2;
    else if(p[i] == q[i] && q[i] == r[i]){}
    else ans++;
  }
  System.out.println(ans);
}}
