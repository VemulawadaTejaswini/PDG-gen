import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        int seki;
        seki = a * b;

        //奇数
        if(seki % 2 == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}