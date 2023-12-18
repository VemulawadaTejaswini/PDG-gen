import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scan.nextInt();
        }
        Arrays.sort(l);
        int answer = 0;
        for (int i = n-k; i < n; i++) {
            answer += l[i];
        }
        System.out.println(answer);
    }
}
