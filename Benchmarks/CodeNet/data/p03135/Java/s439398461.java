

        import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println(String.format("%.10f", a / b));
    }
}
