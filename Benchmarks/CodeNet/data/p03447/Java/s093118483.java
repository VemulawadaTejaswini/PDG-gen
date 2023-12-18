import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int x = stdIn.nextInt();
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        
        System.out.println((x - a) % b);
    }
}
