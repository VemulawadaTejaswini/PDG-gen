import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String s = scanner.next();

        if(a >= 3200) {
            System.out.println(s);
        } else {
            System.out.println("red");
        }
    }
}

