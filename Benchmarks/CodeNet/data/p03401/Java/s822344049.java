import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int[] a = new int[n];

        for(int i=0;i < n;i++) {
            a[i] = Integer.parseInt(scanner.next());
        }

        for(int i=0;i < n;i++) {
            int answer = 0;
            int spot = 0;

            for (int j=0;j < n;j++) {
                if (i==j) continue;
                answer += Math.abs(spot - a[j]);
                spot = a[j];
            }
            answer += Math.abs(0 - spot);
            System.out.println(answer);
        }
    }
}