import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long K;
        int Q;
        int[] Ai;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            K = sc.nextLong();
            Q = sc.nextInt();
            Ai = new int[Q];
            for (int i = 0; i < Ai.length; i++) {
                Ai[i] = sc.nextInt();

            }
        }
        long[] Answer = new long[N];
        long[] Point = new long[N];
        for (int i = 0; i < Ai.length; i++) {
            Answer[ Ai[i] -1]++;
        }
        for(int i = 0; i < Point.length; i++){
            Point[i] = K - Q + Answer[i];
        }
        for(int i = 0; i < Point.length; i++){
            if(Point[i] > 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }




    }

}
