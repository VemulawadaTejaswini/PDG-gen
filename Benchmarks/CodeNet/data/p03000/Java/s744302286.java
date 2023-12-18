import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();
        int L[] = new int[N+1];
        int D[] = new int[N+2];
        D[1] = 0;
        for (int i = 1; i <= N; i++) {
            L[i] = scan.nextInt();//3 4 5
        }
        int count=1;
        for (int j = 2; j <= N + 1; j++) {
                D[j] = D[j - 1] + L[j-1]; //座標
                if (X < D[j]){
                    break;
                }
                count++;
        }
        System.out.println(count);
        scan.close();
    }
}
