import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int arr[] = new int[a];
        long t = 0;
        for (int i = 0;i < arr.length;++i){
            arr[i] = scanner.nextInt();
            t += arr[i];
        }
        t /= a;
        int a1,a2,a3;
        long tt = 0;
        for (a1 = 0;a1 < a - 3;++a1){
            tt += arr[a1];
            if(tt >= t){
                ++a1;
                break;
            }
        }
        --a1;
        tt = 0;
        for (a2 = a1 + 1;a2 < a - 2;++a2){
            tt += arr[a2];
            if(tt >= t){
                ++a2;
                break;
            }
        }
        --a2;
        tt = 0;
        for (a3 = a2 + 1;a3 < a - 1;++a3){
            tt += arr[a3];
            if(tt >= t){
                ++a3;
                break;
            }
        }
        --a3;
        int k1ma = a1 + 4 >= a - 3 ? a - 4 : a1 + 4;
        int k1mi = a1 - 4 < 0 ? 0 : a1 - 4;
        int k2ma = a2 + 4 >= a - 2 ? a - 3 : a2 + 4;
        int k2mi = a2 - 4 < 1 ? 1 : a2 - 4;
        int k3ma = a3 + 4 >= a - 1 ? a - 2 : a3 + 4;
        int k3mi = a2 - 4 < 2 ? 2 : a3 - 4;
        long min = Long.MAX_VALUE;
        for (int x1 = k1mi;x1 <= k1ma;++x1){
            for (int x2 = k2mi;x2 <= k2ma;++x2){
                for (int x3 = k3mi;x3 <= k3ma;++x3){
                    if(x1 == x2||x2 == x3||x3 == x1)continue;
                    long ts[] = new long[4];
                    int i;
                    for (i = 0;i <= x1;++i){
                        ts[0] += arr[i];
                    }
                    for (;i <= x2;++i){
                        ts[1] += arr[i];
                    }
                    for (;i <= x3;++i){
                        ts[2] += arr[i];
                    }
                    for (;i < a;++i){
                        ts[3] += arr[i];
                    }
                    Arrays.sort(ts);
                    long k = ts[3] - ts[0];
                    //System.out.println(x1 + ":" + x2 + ":" + x3 + "/" + k);
                    if(min > k)min = k;
                }
            }
        }
        System.out.println(min);
    }
}
