import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();
        System.out.println(watch(seconds));
    }

    private static String watch(int seconds) {
        int h = seconds / (60*60);
        seconds = seconds % (60*60);
        int m = seconds / 60;
        int s = seconds % 60;
        return h + ":" + m + ":" + s;
    }
}
