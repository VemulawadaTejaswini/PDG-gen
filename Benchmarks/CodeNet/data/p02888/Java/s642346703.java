import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] strings;

        int N = Integer.parseInt(in.readLine());
        
        strings = in.readLine().split(" ");
        
        int[] L = toArray(strings);
        Arrays.sort(L);
        
        int count = 0;
        for (int i = 0; i < N; ++i) {
            int a = L[i];
            for (int j = i + 1; j < N; ++j) {
                int b = L[j];
                int ab = a + b;

                int index = Arrays.binarySearch(L, j + 1, L.length, ab) + 1;
                int l2 = -index - (j + 1);
                count += l2;
            }
        }
        System.out.println(count);
    }
    
    static int[] toArray(String[] strings) {
        int[] array = new int[strings.length];
        for (int i = 0; i < array.length; ++i) {
            array[i] = Integer.parseInt(strings[i]);
        }
        return array;
    }
}
