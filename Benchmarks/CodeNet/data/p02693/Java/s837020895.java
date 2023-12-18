import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long X = s.nextInt();

        long dep = 100;
        long i = 0;
        while (X > dep) {
            dep = (long) Math.floor(dep * 1.01);
            i++;
        }
        System.out.println(i);
        s.close();
    }
}