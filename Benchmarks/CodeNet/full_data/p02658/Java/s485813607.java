import java.util.Scanner;

public class Main {
    static long longNum = 1000000000000000000L;

    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    public static void main(String[] args) {
        long ans = sc.nextLong();
        boolean flg = false;
            while(sc.hasNext()){
                ans *= sc.nextLong();
            }
        if (ans > longNum) {
            flg = true;
        }
            if (!flg){
                System.out.println(ans);
            } else {
                System.out.println(-1);
            }
    }
}
