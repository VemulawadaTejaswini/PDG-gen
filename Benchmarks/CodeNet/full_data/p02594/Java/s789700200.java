//package A;
//A - Air Conditioner
import java.util.Scanner;

public class Main {
    public void AirFunc(int temperature) {
        if (temperature >= 30)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main airObj = new Main();
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            airObj.AirFunc(n);
        }
    }
}
