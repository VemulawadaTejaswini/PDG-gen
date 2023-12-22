import java.util.Scanner;

public class Main {

    static int[] cache;
    static int[] ret;
    static int[] cacheType = {10, 50, 100, 500};

    static int[] change(int c) {
        int rest[] = new int[4];
        int amount = c;
        for (int i = 3; i >= 0; i--) {
            rest[i] = amount / cacheType[i];
            amount -= rest[i] * cacheType[i];
        }

        return rest;
    }

    static void printRet(int[] rest) {
        for(int i = 0; i < 4; i++) {
            if (rest[i] != 0) {
                System.out.println(cacheType[i] + " " + rest[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int pay = Integer.parseInt(sc.next());
            int sum = 0;
            if (pay == 0)
                break;
            int[] ans = new int[4];

            cache = new int[4];
            for (int i = 0; i < 4; i++) {
                cache[i] = Integer.parseInt(sc.next());
                sum += cache[i] * cacheType[i];
            }
            int c = sum - pay;
//            System.out.println("rest of money: " + c);
            ret = change(c);
//            System.out.println("rest of coins: " + Arrays.toString(ret));

            for (int i =0; i < 4; i++) {
                if (cache[i] >= ret[i])
                    ans[i] = cache[i] - ret[i];
            }

            printRet(ans);
            System.out.println();
        }
    }
}