import java.util.Scanner;

public class Main{

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int answer;

        if(num1 > 10){
            System.out.println(num2);
        }else{
            answer = num2 - 100 * (10 - num1);
            System.out.println(answer);
        }
    }
}
