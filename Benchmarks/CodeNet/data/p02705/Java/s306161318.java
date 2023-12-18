import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
        double r = sc.nextDouble();
        double en = 2 * r * 3.14159;
        System.out.println(en);
    }

}