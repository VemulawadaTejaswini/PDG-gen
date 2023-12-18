import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int c = 0;
        while(X >= 500) {
            X -= 500;
            c += 1000;
        }
        while(X >= 5) {
            X -= 5;
            c += 5;
        }
        System.out.println(c);
    }
}

