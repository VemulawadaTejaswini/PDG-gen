import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String target = sc.next();
        str += str;
        if (str.indexOf(target) != -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

