
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ninzu = scanner.nextInt();

        int[] tensu = new int[ninzu];

        for (int i = 1; ninzu >= i; i++) {
            tensu[i] = scanner.nextInt();
        }

        long goukei = 0;

        for (int i = 1; ninzu >= i; i++) {
            goukei += tensu[i];
        }

        long heikin = goukei / ninzu;
        
        long bunsan=0;

        for (int i = 1; ninzu >= i; i++) {
            bunsan+=(tensu[i]-heikin)*(tensu[i]-heikin)/ninzu;
        }
        long bunsan2;
        bunsan2=Math.sqrt(bunsan);
        
        System.out.println(bunsan2);
    }
}