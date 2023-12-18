import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        List<Integer> divDigitList = divDigitList(n);
        int min = divDigitList.stream().mapToInt(i -> i).min().orElse(0);
        int result = min;

        // 出力
        System.out.println(result);
    }

    public static List<Integer> divDigitList(long num) {
        List<Integer> list = new ArrayList<>();
        long max = (long) Math.sqrt(num);
        for (long i = 1; i <= max; i++) {
            if (num % i == 0) {
                long a = i;
                long b = num / i;
                int digit = Math.max(Long.toString(a).length(), Long.toString(b).length());
                list.add(digit);
            }
        }
        return list;
    }
}
