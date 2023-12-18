import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        char[] ch = String.valueOf(n).toCharArray();
        System.out.println((ch.length - 1) * 9 + (ch[0] - '0') - 1);
    }

}
