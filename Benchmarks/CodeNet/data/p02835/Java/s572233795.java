import java.util.Scanner;
public class task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A1 = scan.nextInt();
        int A2 = scan.nextInt();
        int A3 = scan.nextInt();
        if((A1+A2+A3)>=22)
            System.out.println("bust");
        else
            System.out.println("win");
    }
}
