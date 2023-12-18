import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }
        int sum = IntStream.of(list).sum();
        int min = (int)10e5;
        int mid = 0;
        for(int i=1; i<N; i++) {
            int suml=0;
            for(int j=0; j<i; j++) {
                suml += list[j];
            }
            if( Math.abs(suml - (sum-suml)) < min) {
                min = Math.abs(suml - (sum-suml));
                mid = i;
            }
            
            
        }
        System.out.println(min);
    }
}