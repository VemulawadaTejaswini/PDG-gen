import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        String s = stdIn.next();

        int count = 0;
        int i = 0;
        while (i < n - 2) {
            if (s.charAt(i) == 'A') { // "A??"
                if (s.charAt(i + 2) == 'C') { // "A?C"
                    if (s.charAt(i + 1) == 'B') { // "ABC"
                        count++;
                    }
                    i += 2;
                    continue;
                } else {
                    i += 3;
                    continue;
                }
            } else {
                i++;
                continue;
            }
        }

        System.out.println(count);
    }
}