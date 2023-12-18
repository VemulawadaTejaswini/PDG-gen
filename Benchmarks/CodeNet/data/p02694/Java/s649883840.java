import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long X = s.nextInt();

        long dep = 100;
        int i = 0;
        while (X > dep) {
            dep += dep / 100;
            i++;
        }
        System.out.println(i);
        s.close();
    }
}