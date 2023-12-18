import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] l = new int[n];
        for (int i = 0; i < l.length; i++) {
            l[i] = sc.nextInt();
        }
        int[] bit = new int[3];
        int result = (int)Math.pow(10, 9);
        for (bit[0] = 1; bit[0] < (1 << n); bit[0]++) {
            for (bit[1] = 1; bit[1] < (1 << n); bit[1]++) {
                if ((bit[1] & bit[0]) != 0) {
                    continue;
                }
                for (bit[2] = 1; bit[2] < (1 << n); bit[2]++) {
                    if ((bit[2] & bit[0]) != 0 || (bit[2] & bit[1]) != 0) {
                        continue;
                    }
                    int[] len = new int[3];
                    int[] num = new int[3];
                    for (int i = 0; i < bit.length; i++) {
                        for (int j = 0; j < n; j++) {
                            if ((bit[i] & (1 << j)) != 0) {
                                len[i] += l[j];
                                num[i]++;
                            }
                        }
                    }
                    int score = 0;
                    for (int i = 0; i < num.length; i++) {
                        score += Math.abs(len[i] - a[i]) + (num[i] - 1) * 10;
                    }
                    result = Math.min(result, score);
                }   
            }
        }
        System.out.println(result);
        sc.close();
    }
}