import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        boolean ret = solver(str);
        System.out.println(ret ? "Yes" : "No");
        return;
    }

    private static boolean solver(String s) {
        int sn = s.chars().map(c -> c - '0').sum();
        int n = Integer.parseInt(s);
        return n % sn == 0;
    }
}