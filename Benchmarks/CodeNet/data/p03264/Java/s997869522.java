import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int c =(num/2 + num%2)* num/2;
        System.out.println(c);
        scan.close();
    }
}
