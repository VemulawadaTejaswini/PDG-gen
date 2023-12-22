import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int h, m, s, temp;

        h = S / 3600;
        temp = S % 3600;
        m = temp / 60;
        s = temp % 60;

        System.out.println(h+":"+m+":"+s);
    }
}