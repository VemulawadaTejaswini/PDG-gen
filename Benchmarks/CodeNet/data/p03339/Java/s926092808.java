import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int min = n-1;
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'E') {
                count++;
            }
        }

        min = Math.min(min, count);

        for (int i = 1; i < n-1; i++) {
            if (s.charAt(i-1) == 'E' && s.charAt(i) == 'E') {
                count--;
            }

            if (s.charAt(i-1) == 'W' && s.charAt(i) == 'W') {
                count++;
            }

            min = Math.min(min, count);
        }

        System.out.println(min);
    }
}
