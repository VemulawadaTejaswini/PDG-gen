import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String[] s = sc.next().split("");
    String[] ss = "CODEFESTIVAL2016".split("");
    int  cnt = 0;
    for(int i = 0;i<s.length;i++){
      if(s[i].equals(ss[i]));
      else cnt++;
    }
    System.out.println(cnt);
  } 
}