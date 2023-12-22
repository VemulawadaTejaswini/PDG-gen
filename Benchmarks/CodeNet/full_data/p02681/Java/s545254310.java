import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String t = scanner.next();

        if(!t.startsWith(s)){
            System.out.println("No");
            System.exit(0);
        }
        if(t.length() != s.length() + 1){
            System.out.println("No");
            System.exit(0);
        }

        System.out.println("Yes");
    }
}