import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int S = sc.nextInt();
        int X = 0, Y = 0, Z = 0;
        int count = 0;
        for(int i = 0; i <= K; i++) {
            for(int j = 0; j <= K; j++) {
                for(int k = 0; k <= K; k++){
                    X = i;
                    Y = j;
                    Z = k;
                    int total = X + Y + Z;
                    if(total == S){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
