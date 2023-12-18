import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int crackers =  sc.nextInt();
        int people =  sc.nextInt();
        if(people == 1) {
            System.out.println(crackers);
            return;
        }
        if(people % crackers == 0) System.out.println(0);
        else System.out.println(1);
    }
}
