import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
           while (scanner.hasNext()){
               String s = scanner.next();
               if (s.equals("-")){
                   break;
               }
               int m = scanner.nextInt();
               String shuffle = "";
               for (int i = 0; i < m; i++) {
                   int h = scanner.nextInt();
                   String a = s.substring(0,h);
                   String b = s.substring(h,s.length());
                   s = b+a;
               }
               System.out.println(s);

           }

        } catch (Exception e) {

        } finally {

        }

    }
}


