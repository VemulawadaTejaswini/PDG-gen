import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            String s = String.valueOf(i);
            StringBuilder sb1 = new StringBuilder(s.substring(0, s.length() / 2));
            StringBuilder sb2 = new StringBuilder();
            if (s.length() % 2 == 0) {
                sb2.append(s.substring(s.length() / 2, s.length()));
            } else {
                sb2.append(s.substring(s.length() / 2 + 1, s.length()));
            }
            if (sb1.toString().equals(sb2.reverse().toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
}