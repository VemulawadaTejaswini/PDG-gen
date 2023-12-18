import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  String s = sc.next();
  String t = sc.next();
  char[] c1 = s.toCharArray();
  char[] c2 = t.toCharArray();
  List<char> L1 = new ArrayList<char>();
  List<char> L2 = new ArrayList<char>();
  for(int i = 0;i < c1.length();i++){
    L1.add(c1[i]);
  }
  for(int i = 0;i < c2.length();i++){
    L2.add(c2[i]);
  }
  Collections.sort(L1);
  Collections.sort(L2);
  for(int i = 0;i < c1.length();i++){
    String s1i = L1.get(i);
  }
  for(int i = 0;i < c2.length();i++){
    String s2i = L2.get(i);
  }
  for(int i = 0;i < c1.length();i++){
    String ss = s10 + s1i;
  }
  for(int i = 0;i < c2.length();i++){
    String tt = s20 + s2i;
  }
  List<String> ans = new Arraylist<String>();
  ans.add(ss);
  ans.add(tt);
  Collections.sort(ans);
  if(ans.get(0).equals(ss))System.out.println("Yes");
  else System.out.println("No");
}}
  
    
