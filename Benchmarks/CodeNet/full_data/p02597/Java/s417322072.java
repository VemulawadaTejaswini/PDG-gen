import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        String s = sc.next();

        int[] w = new int[n + 1];
        int[] r = new int[n + 1];

        w[0] = 0;
        r[n] = 0;
        for(int i = 0; i < n; i++){
            w[1 + i] = w[i];
            if(s.charAt(i) == 'W'){
                w[1 + i]++;
            }
            r[n - i - 1] = r[n - i];
            if(s.charAt(n - i - 1) == 'R'){
                r[n - i - 1]++;
            }
        }

        int min = -1;
        for(int i = 0; i < n + 1; i++){
            int temp = Math.abs(r[i] - w[i]) + Math.min(r[i], w[i]);
            if(min == -1 || temp < min){
                min = temp;
            }
        }

        System.out.println(min);
    }
}