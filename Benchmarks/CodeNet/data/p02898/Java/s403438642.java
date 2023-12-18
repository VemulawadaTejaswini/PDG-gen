import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =  sc.nextInt();
        int K =  sc.nextInt();
        int[] h = new int[N];
        for(int i = 0; i < N; i++){
            h[i] = sc.nextInt();
        }

        System.out.println(Arrays.stream(h).filter(x -> x >= K).count());

    }
}
