import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int t = stdIn.nextInt();

        System.out.println((t+0.5)/a*b);
    }
}
