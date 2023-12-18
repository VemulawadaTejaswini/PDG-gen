import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        sc.close();

        if (String.valueOf(N.charAt(0)).equals("7") || String.valueOf(N.charAt(1)).equals("7")
                || String.valueOf(N.charAt(2)).equals("7")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
