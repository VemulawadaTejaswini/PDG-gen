import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();

        int[] list = new int[N];
        int min = (int)1e5;
        int mid = 0;
        for(int i=0; i<N; i++) {
            int score = i+L;
            list[i] = score;
            if(score*score < min*min) {
                mid = i;
                min = score;
            }
        }
        System.out.println(IntStream.of(list).sum()-min);
        
    }
}