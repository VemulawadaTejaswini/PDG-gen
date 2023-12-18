import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        int num500 = X / 500;
        int num5 = (X - 500*num500) / 5;

        System.out.println( num500 * 1000 + num5 * 5);
    }
}