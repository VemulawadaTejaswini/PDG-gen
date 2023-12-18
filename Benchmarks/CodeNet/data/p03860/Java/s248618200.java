import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String strLine = scan.nextLine();
        scan.close();
        String[] str = strLine.split("", 0); 

        System.out.println("A" + str[0] + "C");


    }
}
