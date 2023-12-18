import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a == 1 ? 14 : a;
        b = b == 2 ? 14 : b;
        if(a - b > 0)System.out.println("Alice");
        else if(a - b < 0)System.out.println("Bob");
        else System.out.println("Draw");
    }


}