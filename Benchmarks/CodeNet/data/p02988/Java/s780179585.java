import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n-2; i++) {
            int prev = p[i];
            int curr = p[i+1];
            int next = p[i+2];
            if((prev < curr && curr < next) || (prev > curr && curr > next)) count++;
        }
        System.out.println(count);
    }
}
