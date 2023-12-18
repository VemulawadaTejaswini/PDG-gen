import java.util.Scanner;

public class Main{
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
         * 標準Int入力 int y = scan.nextInt();
         */
        int n = scan.nextInt();
        System.out.println(xx(n));
    }

    public static int xx(final int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            count = count + i;
        }

        return count;
    }

    public static void test() {
        System.out.println("テストだよ~");
    }

    public static int max(final int x, final int y) {
        if (x > y){
            return x;
        }else{
            return y;
        }
    }
}
