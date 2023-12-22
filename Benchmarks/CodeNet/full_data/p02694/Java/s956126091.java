import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double X = in.nextDouble();
        int counter = 0;
        long i = 100;
        while(i < X) {
            i +=  (i * 0.01);
            counter++;
        }
        System.out.println(counter);
    }
}
