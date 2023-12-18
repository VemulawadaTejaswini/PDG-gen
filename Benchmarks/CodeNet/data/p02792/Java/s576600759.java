import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            for (int k = 1; k < n; k++) {
                if (Integer.toString(i).charAt(0) == Integer.toString(k).charAt(Integer.toString(k).length() - 1)
                        && Integer.toString(k).charAt(0) == Integer.toString(i)
                                .charAt(Integer.toString(i).length() - 1))
                    cnt++;
            }
        }
        if (n == 1)
            cnt = 1;
        System.out.println(cnt);
    }
}