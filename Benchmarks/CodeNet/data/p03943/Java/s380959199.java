import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int total = a + b + c;
        
        String output = "Yes";
        if((a != total / 2) && (b != total / 2) && (c != total / 2)) output = "No";
        System.out.println(output);
    }
}
