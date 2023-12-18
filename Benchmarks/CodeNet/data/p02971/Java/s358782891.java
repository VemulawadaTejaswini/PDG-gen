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
            List<Integer> copy = numbers;
            int a = Collections.max(copy);
            int b = copy.indexOf(a);
            copy.remove(b);
            int c = Collections.max(copy);
            if (a == c) {
                for (int i=0; i<N; i++) {
                    System.out.println(a);
                }
                System.exit(0);
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