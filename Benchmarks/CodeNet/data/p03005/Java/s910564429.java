import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ball = in.nextInt();
        int man = in.nextInt();
        in.close();
        int ans = man > 1 ? ball - man : 0;
        System.out.println(ans);
    }
}
