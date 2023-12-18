import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a + b == 3){
            System.out.println(3);
        }
        else if (a + b == 5){
            System.out.println(1);
        }
        else {
            System.out.println(2);
        }
    }
}
