import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        String s = stdIn.next();

        int count = 0;
        int i = 0;
        while (i < n - 2) {
            if (s.charAt(i) == 'A') {
                if (s.charAt(i + 1) == 'B') {
                    if (s.charAt(i + 2) == 'C') {
                        count++;
                    }
                }
            }
            i++;
        }

        System.out.println(count);
    }
}