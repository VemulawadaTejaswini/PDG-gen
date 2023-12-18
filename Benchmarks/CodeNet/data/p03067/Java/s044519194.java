package ex2;
import java.*;
import java.util.Scanner;

public class ABC0420 {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a < c && c < b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
