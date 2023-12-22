import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        double yokin = 100;
        long year = 0;
        while(yokin < x) {
            yokin = Math.floor(yokin * 1.01);
            year++;
        }
        System.out.println(year);
    }
}