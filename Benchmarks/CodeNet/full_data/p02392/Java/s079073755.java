import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        String symbol = "";

        if(a < b && b < c)
            symbol = "Yes";
        else
            symbol = "No";

        System.out.println(symbol);
    }
}

