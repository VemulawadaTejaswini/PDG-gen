import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int div500 = X/500;
        X = X - 500*div500;
        int div5 = X/5;
        System.out.println(1000*div500+5*div5);
    }
}