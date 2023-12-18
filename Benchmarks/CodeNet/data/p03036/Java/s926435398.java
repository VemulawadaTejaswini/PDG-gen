import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        for(int i = 0; i<10;i++){
            num3 = num1*num3 - num2;
            System.out.println(num3);
        }
    }
}