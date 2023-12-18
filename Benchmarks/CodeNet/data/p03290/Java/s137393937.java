import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        long g = sc.nextLong();
        List<List<Long>> list = new ArrayList<>();
        for (int i = 1; i <= d; i++) {
            int p = sc.nextInt();
            int c = sc.nextInt();
            List<Long> l = new ArrayList<>();
            for (int j = 0; j < p - 1; j++) {
                l.add(100l * i);
            }
            l.add(100l * i + c);
            list.add(l);
        }
        sc.close();

//        System.out.println(list);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < pow(2, d); i++) {
            String str = toBinaryString(i, d);
//            System.out.println(str);
            int num = 0;
            long sum = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    num += list.get(j).size();
                    sum += sum(list.get(j));
                }
            }

//            System.out.println("sum=" + sum + ", num=" + num);
            if (sum >= g && num <= ans) {
                ans = num;
            }

            int lastZeroIndex = str.lastIndexOf('0');
            if (lastZeroIndex >= 0) {
                for (int j = 0; j < list.get(lastZeroIndex).size(); j++) {
                    sum += list.get(lastZeroIndex).get(0);
                    num++;
                    if (sum >= g && num <= ans) {
                        ans = num;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    static long sum(List<Long> list) {
        long ret = 0;
        for (Long l : list) {
            ret += l;
        }
        return ret;
    }

    // baseのn乗を計算を返す
    static int pow(int base, int n) {
        int ret = 1;
        for (int i = 0; i < n; i++) {
            ret *= base;
        }
        return ret;
    }

    // intをlength桁のbit文字列に変換
    static String toBinaryString(int input, int length) {
        return toBinaryString(input).substring(29 - length);
    }

    // intを29桁のbit文字列に変換
    static String toBinaryString(int input) {
        String ret = "";
        int max = 0x10000000;
        for (int i = 0; i < 29; i++) {
            int tmp = input / max;
            ret += tmp;
            input %= max;
            max /= 2;
        }
        return ret;
    }

}
