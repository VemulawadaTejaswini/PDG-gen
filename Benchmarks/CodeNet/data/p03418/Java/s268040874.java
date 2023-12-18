import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int count = 0;
        for (int a = K == 0? 1: K ; a <= N; a++){
            for (int b = K + 1; b <= N; b++) {
                if(a < b){
                    count += N - a;
                    break;
                }else if (a % b >= K) {
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
