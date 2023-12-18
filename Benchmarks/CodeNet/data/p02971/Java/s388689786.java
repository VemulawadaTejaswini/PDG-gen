import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;
        List<Integer> numbers = new ArrayList<>();
        try {
            N  = Integer.parseInt(br.readLine());
            for (int i=0; i<N; i++) {
                numbers.add(Integer.parseInt(br.readLine()));
            }
            int max;
            for (int i=0; i<N; i++) {
                max = 0;
                for (int j=0; j<N; j++) {
                    if (j != i && numbers.get(j) > max) {
                        max = numbers.get(j);
                    }
                }
                System.out.println(max);
            }
            br.close();
        }
        catch(Exception e) {
        }
    }
}