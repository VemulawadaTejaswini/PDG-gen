import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String s = sc.next();
        int K = Integer.parseInt(sc.next());
        System.out.println(s.replaceAll("[^" + String.valueOf(s.charAt(K - 1)) + "]", "*"));

    }
}
