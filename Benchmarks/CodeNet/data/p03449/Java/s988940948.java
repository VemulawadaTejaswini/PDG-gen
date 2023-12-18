import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A1 = new int[N];
        int[] A2 = new int[N];
        int[] count = new int[N];
        for (int i = 0; i < N ; i++) {
            A1[i] = sc.nextInt();
            if(i >=1){
                A1[i] += A1[i-1];
            }
        }

        for (int j = 0; j < N ; j++) {
            A2[j] = sc.nextInt();
        }

        for (int j = N-2; j >=0 ; j--) {
            A2[j]+=A2[j+1];
        }

        for (int i = 0; i < N ; i++) {
            count[i] = A1[i] + A2[i];
        }
        System.out.println( IntStream.of(count).max().getAsInt());
    }
}