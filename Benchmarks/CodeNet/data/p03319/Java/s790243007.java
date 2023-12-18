import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int num = scan.nextInt();
        int k = scan.nextInt();
        for(int i = 0; i < num; i++){
            int temp = scan.nextInt();
        }

        // answer
        System.out.println(num / (k - 1));

    }
}