import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String[] str2 = str.split("");
            int count = 0;
            for(int i = 0; i < str2.length; i++){
              if("+".equals(str2[i])){
                count++;
              } else {
                count--;
              }
      }
      System.out.println(count);
          }
}