import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str1 = sc.next();
            if("a".equals(str1) || "i".equals(str1) || "u".equals(str1) || "e".equals(str1) || "o".equals(str1)){
              System.out.println("vowel");
            } else {
              System.out.println("consonant");
            }
            }
}