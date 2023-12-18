import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        if (n <= 9) {
            ans = n;
        } else if (n <= 999 && n >= 100) {
            ans = n-90;
        } else if (n <= 99999 && n >= 10000) {
            ans = n-9000-90;
        } else if (n >= 10 && n <= 99) {
            ans = 9;
        } else if (n >= 1000 && n <= 9999) {
            ans = 909;
        } else if (n == 100000) {
            ans = n-9000-90-1;
        }
        System.out.println(ans);
    }

}
