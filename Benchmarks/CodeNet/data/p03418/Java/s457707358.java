import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int count = 0;
        for (int a = 1; a <= N; a++){
            for (int b = K + 1; b <= N; b++) {
                if (a % b >= K) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
