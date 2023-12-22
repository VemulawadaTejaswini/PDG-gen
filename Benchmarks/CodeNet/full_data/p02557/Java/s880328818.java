import java.util.Scanner;
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
        
        int shift = 0;
        for (int i = 0; i < N; i++) {
            while (a[i] == b[(i + shift) % N]) {
                shift++;
            }
        }
        
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < N; i++) {
            str.append(b[(i + shift) % N]);
            str.append(" ");
        }
        str.deleteCharAt(str.length() - 1);
        
        System.out.println("Yes");
        System.out.println(str);
    }
}
