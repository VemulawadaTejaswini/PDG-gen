import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 3; i <= n; i++) {
            if (i % 3 == 0 || i % 10 == 3) {
                out.print(" " + i); 
            }   
        }   
        out.println();                                                          
    }   
}