
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt(), M = sc.nextInt();
        if(N % 2 == 1){
            for(int i=1;i<=M;i++){
                System.out.println(i + " " + (N-i));
            }
        }else{
            int half = N/2;
            for(int i=1;i<=M;i++){
                if(i % 2 == 1) {
                    int j = i / 2 + 1;
                    System.out.println(j + " " + (N - j));
                }else{
                    int j = i / 2;
                    System.out.println((half + 1 - j) + " " + (half + j));
                }
            }
        }
    }
}
