import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int a = 0;
    int b = 0;
    int c = 0;
    for(int i = 0;i < s.length();i++){
      char x = s.charAt(i);
      if(x=='a')a++;
      else if(x=='b')b++;
      else c++;
    }
    int max = Math.max(a,Math.max(b,c));
    if(max-a<=1&&max-b<=1&&max-c<=1)System.out.println("YES");
    else System.out.println("NO");
  }
}