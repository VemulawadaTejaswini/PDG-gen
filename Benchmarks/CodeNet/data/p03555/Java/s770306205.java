import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String row1 = sc.next();
        String row2 = sc.next();

        String reverse = row1.charAt(2) + "" + row1.charAt(1)+ ""  + row1.charAt(0);

        if ( reverse.equals(row2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
