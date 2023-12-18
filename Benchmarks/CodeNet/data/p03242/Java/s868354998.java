import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        String r = "";
        for (char c : n.toCharArray()) {
            r += solve(c);
        }
        System.out.print(r);

    }

    static char solve (char c){
        switch (c) {
            case '1':
                return '9';
            case '9':
                return '1';
            default:
                return c;
        }
    }
}