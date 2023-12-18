import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(reader.readLine());
            List<Integer> numbers = new ArrayList<>();
            int max = 1, second = 1;
            for (int i=0; i<N; i++) {
                numbers.add(i, Integer.parseInt(reader.readLine()));
                if (numbers.get(i) >= max) {
                    second = max;
                    max = numbers.get(i);
                }
            }
            for (int i=0; i<N; i++) {
                if (numbers.get(i) == max) {
                    System.out.println(second);
                }
                else {
                    System.out.println(max);
                }
            }
            reader.close();
        }
        catch(Exception e) {}
    }
}