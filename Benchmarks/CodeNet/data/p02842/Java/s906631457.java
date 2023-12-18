import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        double price = scan.nextDouble();
        double taxRate = 1.08;
        double pcWithOutTaxF = Math.floor(price / taxRate);
        double pcWithOutTaxC = Math.ceil(price / taxRate);
        double confirmF = Math.floor(pcWithOutTaxF * taxRate);
        double confirmC = Math.floor(pcWithOutTaxC * taxRate);

        if (price == confirmF) {
            System.out.println((int)pcWithOutTaxF);
        } else if (price == confirmC) {
            System.out.println((int)pcWithOutTaxC);
        } else {
            System.out.println(":(\n");
        }
    }
}