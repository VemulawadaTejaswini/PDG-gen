import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String[] str2 = str.split("");
            for(int i = 0; i < str2.length; i++){
              if("1".equals(str[i])){
                System.out.println("9");
              } else if("9".equals(str[i])){
                System.out.println("1");
              } else {
                System.out.println(str2[i]);
              }
            }
}