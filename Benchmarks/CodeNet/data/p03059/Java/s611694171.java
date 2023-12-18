import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = Integer.parseInt(s.next());
        int b = Integer.parseInt(s.next());
        int t = Integer.parseInt(s.next());

        int num = 0;
        int c = 1;
        int time = a;

        while (time < t + 0.5) {
            num += b;
            time += a;
            c++;
        }

        System.out.println(num);
    }
}