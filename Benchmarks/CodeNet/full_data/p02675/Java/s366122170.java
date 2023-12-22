

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "hon";
        switch (n % 10) {
            case 0:
            case 1:
            case 6:
            case 8:
                ans = "pon";
                break;
            case 3:
                ans = "bon";
                break;
        }
        System.out.println(ans);
        sc.close();
    }
}