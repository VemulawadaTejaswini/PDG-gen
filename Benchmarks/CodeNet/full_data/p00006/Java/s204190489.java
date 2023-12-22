import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String a = sc.next();
            for (int i=a.length(); i>0; i--){
                System.out.printf("%s",a.charAt(i-1));
            }
            System.out.println();
        }
    }
}
