import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ninzu=sc.nextInt();
        int haba=sc.nextInt();
        int shai=sc.nextInt();
        System.out.println((ninzu-shai)/(haba+shai));
    }
}