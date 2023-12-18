import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        boolean flag = true;
//        long res = 0;

        if (n % 2 == 0) {
            for (int i = 0; i < n; i += 2) {
                if (a[i] != a[i + 1]) {
                    flag = false;
                    break;
                }
            }

        } else {
            for (int i = 1; i < n; i += 2) {
                if (a[i] != a[i + 1]) {
                    flag = false;
                    break;
                }
            }
            if (a[0] != 0) {
                flag = false;
            }

        }

        if (flag) {
            long res = 1;
            for (int x=0; x<n/2; x++) { //なんか怖かったので、Math.powじゃなくてforで計算
                res = 2*res%1000000007; //0の数を間違えた。痛恨。
            }
//            res = (long) Math.pow(2, n / 2);
            System.out.println(res);
        }else{
            System.out.println(0);
        }

//        res %= 1000000007;


    }

}
