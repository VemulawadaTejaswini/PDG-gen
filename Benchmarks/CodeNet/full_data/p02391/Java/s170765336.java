import java.util.Scanner;                                                                                                                          

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(Sytem.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }
    }
}