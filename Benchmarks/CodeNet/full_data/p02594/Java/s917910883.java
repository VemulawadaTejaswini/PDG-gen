import java.util.Scanner;

class AirConditioner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float temp = scanner.nextFloat();
        if (temp >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
