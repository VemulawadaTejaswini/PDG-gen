import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int K = s.nextInt();
        String str = s.next();

        if (str.length() <= K) System.out.print(str);
        else System.out.print(str.substring(0, K) + "...");
    }
}