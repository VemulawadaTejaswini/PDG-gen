import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    private int N;
    private long[] lucaArray;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        lucaArray = new long[N+1];

        System.out.println(Luca(N));
    }

    long Luca(int count){
        if(count == 0){
            return 2;
        } else if(count == 1){
            return 1;
        } else if (lucaArray[count] != 0){
            return lucaArray[count];
        } else {
            lucaArray[count] = Luca(count - 1) + Luca(count-2);
            return lucaArray[count];
        }
    }
}