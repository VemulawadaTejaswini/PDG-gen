import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        int num = in.nextInt();
        in.close();
        ans = Math.pow(100, time) * num;
        
        System.out.println(ans);
    }
}
