import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        //int w = stdIn.nextInt();
        //int n = stdIn.nextInt();
        //int k = stdIn.nextInt();
        //String s = stdIn.next();
        
        System.out.println(Math.min(b / a, c));
        //System.out.println();
        //System.out.print();
    }
}
