import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String a = sc.next();
                String b = sc.next();
                String c = sc.next();
                sc.close();
                if(a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) System.out.println("YES");
                else System.out.println("NO");
        }
}//0=48
 //a=97 a -> +26 = 123
//鶏になれ