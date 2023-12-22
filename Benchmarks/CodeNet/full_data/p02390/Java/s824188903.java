import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();
        int h = seconds / 3600;
        int remain = seconds % 3600;
        int m = remain / 60;
        int s = remain % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}
