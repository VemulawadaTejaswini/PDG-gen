import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        boolean result = false;
        
        for (int i=0; i<N; i++) {
            final int[] txy = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
            result = judgeValidMove(txy);
            if(result == false) {
                break;
            }
        }

        if(result == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }

    public static boolean judgeValidMove(int[] txy){
        final int minDist = txy[1] + txy[2];
        // 到達可能な距離か
        if(txy[0] < minDist){
            return false;
        }
        // 最短でたどり着いた時間と予定時間の差が偶数なら到達可能
        if(txy[0]%2 == minDist%2){
            return true;
        } else {
            return false;
        }
    }
}