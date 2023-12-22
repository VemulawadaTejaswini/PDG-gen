

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        int[] mod = new int[2019];
        mod[0] = 1;
        int[] sums = new int[s.length() + 1];
        int idx = 1;
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int num = ((s.charAt(i) - '0') * idx + sums[i + 1]) % 2019;
            sums[i] = num;
            count += mod[num];
            mod[num]++;
            idx = idx * 10 % 2019;
        }
        System.out.println(count);
    }
}
