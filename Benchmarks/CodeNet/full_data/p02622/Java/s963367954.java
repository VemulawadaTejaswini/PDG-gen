import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s[] = sc.next().split("");
    String t[] = sc.next().split("");
    int ans = 0;
    for (int i = 0; i < s.length(); i++){
      if (!(s[i].equals(t[i]))) ans++;
    }
    System.out.println(ans);
  }
}
