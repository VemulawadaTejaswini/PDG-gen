
import java.util.Scanner;

public class Main {
    static long longNum = 1000000000000000000L;

    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    public static void main(String[] args) {
        long ans = 1;
        long arr[] = new long[n];
        int i = 0;
        boolean flg = false;
        while (sc.hasNext()) {
            arr[i] = sc.nextLong();
            i++;
//                ans *= sc.nextLong();
        }
        for (int k = 0; k < n; k++) {
            if (arr[k] == 0) {
                ans = 0;
                break;
            }
        }
            for (int l = 0; l < n; l++) {
                if (arr[l] > longNum) {
                    ans = -1;
                }
            }
            if (ans != 0 || ans != -1) {
                for (int j = 0; j < n; j++) {
                    if (ans > longNum){
                        flg = true;
                        break;
                    }
                    ans *= arr[j];
                }
            }
            if (ans > longNum) {
                flg = true;
            }
            if (!flg) {
                System.out.println(ans);
            } else {
                System.out.println(-1);
            }
        }
    }
