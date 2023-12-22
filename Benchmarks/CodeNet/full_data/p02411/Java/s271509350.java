import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            int m = input.nextInt();
            int f = input.nextInt();
            int r = input.nextInt();
            int gokei = m + f;
            if(m == -1 && f == -1 && r == -1){
                break;
            }
            if (m == -1 || f == -1) {
                System.out.println("F");
            }else if (gokei >= 80){
                System.out.println("A");
            }else if (gokei < 80 && gokei >= 65){
                System.out.println("B");
            }else if (gokei < 65 && gokei >= 50){
                System.out.println("C");
            }else if (gokei < 50 && gokei >= 30 && r >= 50){
                System.out.println("C");
            }else if (gokei < 50 && gokei >= 30){
                System.out.println("D");
            }else if (gokei < 30){
                System.out.println("F");
            }
        }
    }
}
