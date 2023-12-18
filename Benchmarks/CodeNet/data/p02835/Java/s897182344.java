import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int B1 = scan.nextInt();
        int B2 = scan.nextInt();
        int B3 = scan.nextInt();
        if((B1+B2+B3)>=22)
            System.out.println("bust");
        else
            System.out.println("win");
    }
}