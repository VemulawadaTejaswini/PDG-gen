import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int x = 0;
        int max = 0;
        for (int i = 0 ; i < n ; i++) {
            if (s[i] == 'I') {
                x++;
            } else {
                x--;
            }
            max = Math.max(max, x);
        }
        System.out.println(max);
    }

}
