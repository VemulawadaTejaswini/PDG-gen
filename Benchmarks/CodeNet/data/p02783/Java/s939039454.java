import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line1 = input.readLine();
        String line2 = input.readLine();

        String[] h1 = line1.split(" ");
        long[] h2 = Arrays.stream(h1).mapToLong(Long::parseLong).toArray();

        String[] s1 = line2.split(" ");
        long[] s2 = Arrays.stream(s1).mapToLong(Long::parseLong).sorted().toArray();

        if(h2[0] > h2[1]){
            for(long i = 1; i < h2[1] +1 ; i++){
                s2[ (int) (h2[0] - i)] = 0;
            }
            long sum = Arrays.stream(s2).sum();
            System.out.println(sum);

        }else{
            System.out.println(0);

        }
    }
}

