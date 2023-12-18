import java.util.*;
import java.lang.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] a = new long[5];
        for (int q = 0; q < 5; q++) {
            a[q] = sc.nextLong();
        }
        long[] city = new long[6];
        //初期の配置
        city[0] = n;
        for (int i = 1 ; i < 6; i++) {
            city[i] = 0;
        }
        int count = 0;
        //移動
        for(int j =0; j < n + 5; j++) {
            for (int i = 4; i >= 0; i--) {
                if (city[i] < a[i]) {
                    city[i+1] += city[i];
                    city[i] = 0;
                } else if(city[i] >= a[i]){
                    city[i+1] += a[i];
                    city[i] -= a[i];
                }

            }
            count++;
            if (city[5] == n) {
                System.out.println(count);
                break;
            }
        }

        }
    }