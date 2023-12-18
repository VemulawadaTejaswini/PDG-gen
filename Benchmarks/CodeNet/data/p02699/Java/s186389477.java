import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int w = in.nextInt();
        System.out.println(w>=s ? "unsafe" : "safe");
    }
}
