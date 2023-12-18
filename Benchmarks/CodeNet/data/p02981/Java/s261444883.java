
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner myScanner = new Scanner(System.in);
        int numberOfPeople = myScanner.nextInt();
        int trainCost = myScanner.nextInt();
        int taxiCost = myScanner.nextInt();
        if((numberOfPeople * taxiCost) < (numberOfPeople * trainCost)){
            System.out.println(numberOfPeople*taxiCost);
        }
        System.out.println(numberOfPeople*trainCost);

    }
}
