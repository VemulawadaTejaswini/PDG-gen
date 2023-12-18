import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    int[] inputArray;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for(int i=0; i<N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            sum += (y-x)+1;
        }

        System.out.println(sum);
    }

}