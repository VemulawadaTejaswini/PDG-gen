import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        
        for (int i=0; i<N; i++) {
            final int[] txy = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
            if(judgeValidMove(txy) == false) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        sc.close();
    }

    public static boolean judgeValidMove(int[] txy){
        final int minDist = txy[1] + txy[2];
        final int difDist = txy[0] - minDist;
        // 到達可能な距離か
        if(txy[0] <= minDist){
            return false;
        }
        // 最短でたどり着いた時間と予定時間の差が偶数なら到達可能
        if(difDist % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}