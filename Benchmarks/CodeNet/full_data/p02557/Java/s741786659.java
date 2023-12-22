import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        
        final int[] a = new int[N];
        final int[] b = new int[N];
        
        final int[] count = new int[N + 1];
        
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            count[a[i]]++;
        }
        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
            count[b[i]]++;
        }
        
        if (IntStream.of(count).anyMatch(c -> N < c)) {
            System.out.println("No");
            return;
        }
        
        final int[] output = new int[N];
        for (int i = 0, j = 0; i < N; i++) {
            while (a[i] == b[j]) {
                j++;
                if (j == N) {
                    j = 0;
                }
            }
            output[i] = b[j];
            j++;
            if (j == N) {
                j = 0;
            }
        }
        
        String answer = IntStream.of(output).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        
        System.out.println("Yes");
        System.out.println(answer);
    }
}
