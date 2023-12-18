import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int ans = 0;
        for(int i=a; i<=b; i++) {
            int tmp = i;
            int[] num = new int[5];
            int lCnt = 0;
            while(true) {
                if(tmp > 0) {
                    num[lCnt] = tmp % 10;
                    tmp /= 10;
                } else {
                    break;
                }
                lCnt++;
            }
            if(num[0] == num[4] && num[1] == num[3]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
