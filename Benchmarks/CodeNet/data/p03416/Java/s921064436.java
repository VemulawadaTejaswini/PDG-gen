import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++) {
            if(isPalin(i)) cnt++;
        }
        System.out.println(cnt);
    }

    private static boolean isPalin(int num) {
        if(num % 10 == 0) return false;
        int originalNum = num;
        int n = 0;
        while(num > 0) {
            n = n * 10 + num % 10;
            num /= 10;
        }
        return n == originalNum;
    }
}
