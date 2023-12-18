import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] cycle = {"Sunny","Cloudy","Rainy"};
        int num = Arrays.asList(cycle).indexOf(s);

        System.out.println(cycle[num >= 2? 0: num+1]);
    }
}