import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
 
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      String s[]=line.split(" ",0);
      int n=Integer.parseInt(s[0]);
      int k=Integer.parseInt(s[1]);
      int a=n+k;
      int su=a-k;
      int m=a*k;
      int ans=a;
      if(ans<su)
        ans=su;
      if(ans<m)
        ans=m;
        System.out.println(ans);
    }
}