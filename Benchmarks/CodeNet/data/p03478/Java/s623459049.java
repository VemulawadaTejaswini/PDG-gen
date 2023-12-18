import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        int entire_sum = 0;
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            int m = i;
            while(m > 0) { //各桁の合計を計算
                sum += m % 10;
                m /= 10;
            }
            if(a <= sum && sum <= b) {
                entire_sum += i;
                count++;
            }
        }
        System.out.println(entire_sum);
    }
}