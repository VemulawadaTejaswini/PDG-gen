import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int amax = Y/10000;
        int bmax = Y/5000;
        for(int i = 0; i<=amax && i<=N; i++) {
            for(int j = 0; j<=bmax && j<=N; j++) {
                int sum = 10000*i + 5000*j;
                int rest = N - i - j;
                if((Y-sum  == rest*1000) && (rest>=0)) {
                    System.out.println(i + " " + j + " " + rest);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
