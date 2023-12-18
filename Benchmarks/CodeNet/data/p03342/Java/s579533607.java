import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] num = new long[n];
        for(int i = 0; i < n; i++) {
            num[i] = sc.nextLong();
        }
        long ans = 0;
        for(int i = 0; i < n; i++) {
            boolean[] bits = new boolean[20];
            loop: for(int j = i; j < n; j++) {
                for(int k = 0; k < 20; k++) {
                    if(((num[j]>>k) & 1) == 1) {//右からj番目のbitが立っている(1かどうか
                        if (bits[k]) {
                            break loop;
                        } else {
                            bits[k] = true;
                        }
                    }
                }
                ans++;
            }
        }
        System.out.println(ans);
    }
}