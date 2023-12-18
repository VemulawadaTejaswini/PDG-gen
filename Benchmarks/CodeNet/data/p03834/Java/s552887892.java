import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String[] str1 = str.split(",");
            for(int i = 0; i < str1.length; i++){
              System.out.print(str1[i] + " ");
            }
        System.out.println("");
          }
}