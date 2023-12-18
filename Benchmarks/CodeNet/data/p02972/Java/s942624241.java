import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = Integer.parseInt(stdin.nextLine());
        int[] a = Pattern.compile(" ").splitAsStream(stdin.nextLine()).mapToInt(Integer::parseInt).toArray();
        
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (c[i] % 2 == a[i]) {
                continue;
            }
            
            b[i]++;
            for (int factor : factors(i + 1)) {
                c[factor - 1]++;
            }
        }
        
        String ans = Arrays.stream(b).mapToObj(Integer::toString).collect(Collectors.joining(" "));
        System.out.println(b.length);
        System.out.println(ans);
    }
    
    public static Set<Integer> factors(int x) {
        Set<Integer> s = new HashSet<>();
        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                s.add(i);
                s.add(x / i);
            }
        }
        return s;
    }
}