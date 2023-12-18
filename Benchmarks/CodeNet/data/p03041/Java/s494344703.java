import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            String str = sc.next();
            String[] str2 = str.split("");
            str2[y - 1] = str2[y - 1].toLowerCase();
            for(String s : str2){
              System.out.print(s);
            }
        }
}