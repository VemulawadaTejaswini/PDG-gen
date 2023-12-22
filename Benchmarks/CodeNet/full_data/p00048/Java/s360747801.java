import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double a = sc.nextDouble();
            System.out.println(a <= 48 ? "light fly" : a <= 51 ? "fly" : a <= 54 ? "bantam" : a <= 57 ? "feather" : a <= 60 ? "light" : a <= 64 ? "light welter" : a <= 69 ? "welter" : a <= 75 ? "light middle" : a <= 81 ? "middle" : a <= 91 ? "light heavy" : "heavy");
        }
    }
}