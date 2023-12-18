import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        long sum = 0;
        for(int i = 0; i < M; i++) {
            sum += in.nextInt();
        }
        if(sum <= N) {
            System.out.println(N - sum);
        } else {
            System.out.println(-1);
        }
    }

}
