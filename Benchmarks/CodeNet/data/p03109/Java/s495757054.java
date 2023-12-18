import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.next().split("/", 3);

        int y = Integer.valueOf(s[0]);
        int m = Integer.valueOf(s[1]);
        int d = Integer.valueOf(s[2]);
        
        boolean ans = y >= 2019 && m >= 4 && d >= 30;
        System.out.println(ans ? "Heisei": "TBD");
    }
}
