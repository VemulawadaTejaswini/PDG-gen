import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int rate = scan.nextInt();
        int d = scan.nextInt();
        long height = scan.nextInt();

        // answer
        for(int i = 1; i <= 10; i++){
            height = height * rate - d;
            System.out.println(height);
        }

    }
}