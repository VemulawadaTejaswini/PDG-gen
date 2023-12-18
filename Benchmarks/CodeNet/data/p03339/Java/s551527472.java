import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int min = n-1;
        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == 'W') {
                    count++;
                }
            }

            for (int j = i+1; j < n; j++) {
                if (s.charAt(j) == 'E') {
                    count++;
                }
            }

            min = Math.min(min, count);
        }

        System.out.println(min);
    }
}
