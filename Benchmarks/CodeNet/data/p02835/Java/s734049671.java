import java.util.Scanner;
public class Main{
    Scanner scanner = new Scanner();
    int a1 = scanner.nextInt();
    int a2 = scanner.nextInt();
    int a3 = scanner.nextInt();
    if(a1+a2+a3 >=22) {
        System.out.print("bust");
    } else {
        System.out.print("win");
    }
}