import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long X = s.nextInt();

        long dep = 100L;
        long i = 0L;
        while (X > dep) {
            long p = (long) (dep / 100L);
            dep += p;
            i++;
        }
        System.out.println(i);
        s.close();
    }
}