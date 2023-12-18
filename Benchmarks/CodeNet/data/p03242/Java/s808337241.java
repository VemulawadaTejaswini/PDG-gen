import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.next();
        n = n.replace('1','2');
        n = n.replace('9','1');
        n = n.replace('2','9');
        System.out.println(n);
    }
}
