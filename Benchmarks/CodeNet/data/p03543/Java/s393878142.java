import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] str = sc.next().split("");
            if(str[0].equals(str[1]) && str[0].equals(str[2]) || str[1].equals(str[2]) && str[2].equals(str[3]) || str[0].equals(str[1]) && str[1].equals(str[2]) && str[2].equals(str[3])){
              System.out.println("Yes");
            } else {
              System.out.println("No");
            }
          }
}