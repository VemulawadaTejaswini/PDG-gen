import java.util.Scanner;
import java.math.*; 
    
class Main{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(x*y + " " + 2*(x+y));
    }
}