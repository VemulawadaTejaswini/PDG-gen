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
        int[] l = new int[n*2];
        for (int i = 0; i < n*2; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int ans = 0;
        for (int i = 0; i < n*2; i+=2) {
            ans += l[i];
        }
        System.out.println(ans);
    }

}
