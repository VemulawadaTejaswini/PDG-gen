import java.util.Scanner;

public class Main {
    static int[][] map;
    static int[][] label;

    static int M;
    static int N;
    static int T;
    static int P;
    static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();

            if(temp % 2 == 1)cnt++;
        }

        if(cnt % 2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }



}
