import java.util.*;
import java.lang.Math;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        if(c * a + c * b > c * c) System.out.println("Yes");
        else System.out.println("No");
    }
}