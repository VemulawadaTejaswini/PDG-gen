import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String str2 = sc.next();
            String[] str1a = str.split("");
            String[] str2a = str.split("");
            if(str1a[0].equals(str2[2]) && str1a[1].equals(str2a[1]) && str1a[2].equals(str2a[0])){
              System.out.println("YES");
            } else {
              System.out.println("NO");
            }
          }
}