import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        num = num+num^2+num^3;
        System.out.println(num);
        scan.close();
    }
}