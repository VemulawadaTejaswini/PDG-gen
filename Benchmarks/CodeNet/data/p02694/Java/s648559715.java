import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int X = s.nextInt();

        int dep = 100;
        int i = 0;
        while (X > dep) {
            dep = (int) Math.floor(dep * 1.01);
            i++;
        }
        System.out.println(i);
        s.close();
    }
}