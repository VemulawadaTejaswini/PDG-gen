import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        // answer
        if(Math.abs(a - b) % 2 == 0){
            System.out.println(Math.abs(a - b) / 2 + Math.min(a, b));
        } else {
            System.out.println("IMPOSSIBLE");
        }

    }
}