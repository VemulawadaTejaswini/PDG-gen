import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        char[] ch = String.valueOf(n).toCharArray();
        long sum = 0;
        for (int i = 0; i < ch.length; i++) {
            sum += ch[i] - '0';
        }
        System.out.println(Math.max((ch.length - 1) * 9 + (ch[0] - '0') - 1, sum));
    }

}
