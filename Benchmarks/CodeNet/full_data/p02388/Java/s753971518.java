import java.util.Scanner;

public class Main{
    public static void main(String[] argc){
        System.out.println("x= ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int answer = x * x * x;
        System.out.println(answer);
    }
}
