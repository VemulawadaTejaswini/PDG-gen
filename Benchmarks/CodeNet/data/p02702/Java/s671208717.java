import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int size = s.length();
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size + 1; j++) {
                long num = Long.parseLong(s.substring(i, j));
                if (num % 2019 == 0) {
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
