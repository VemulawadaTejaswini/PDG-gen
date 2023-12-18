import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        StringBuilder sb = new StringBuilder();
        sb.append("0 0 1000000000 1 ");
        sb.append(s / 1_000_000_000);
        sb.append(' ');
        sb.append(s % 1_000_000_000);
        System.out.println(sb);
    }

}
