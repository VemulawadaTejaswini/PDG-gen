import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                String s = "No";
                int a = Integer.parseInt(sc.next());
                int b = Integer.parseInt(sc.next());
                int c = Integer.parseInt(sc.next());
                if(a==b && b==c && b>0) s = "YES";
                System.out.println(s);
            }
        }
    }
}