import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int dis = in.nextInt();
        in.close();
        dis += dis + 1;
        int ans = num / dis + 1;
        System.out.println(ans);
    }
}
