import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n>0) {
            n -=1;
            int amari = n % 26;
            sb.append((char)(amari + 'a'));
            n /= 26;
        }
        System.out.println(sb.reverse().toString());
    }
}