import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else if (i < j) {
                    if (c[j] == 'E') {
                        sum++;
                    }
                } else {
                    if (c[j] == 'W') {
                        sum++;
                    }
                }
            }
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}