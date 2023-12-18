import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String s = sc.next();
        if ((con(s,"N")&&con(s,"S"))&&(con(s,"W")&&con(s,"E"))) {
            System.out.println("Yes");
        } else if ((con(s,"N")&&con(s,"S"))&&(!con(s,"W")&&!con(s,"E"))) {
            System.out.println("Yes");
        } else if ((!con(s,"N")&&!con(s,"S"))&&(con(s,"W")&&con(s,"E"))) {
            System.out.println("Yes");
        } else if ((!con(s,"N")&&!con(s,"S"))&&(!con(s,"W")&&!con(s,"E"))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    private static boolean con(String s1, String s2) {
        return s1.indexOf(s2) >= 0;
    }
}
