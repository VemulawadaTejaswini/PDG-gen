import java.util.*; 
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        
        System.out.println( r*r*Math.PI + " " + 2*Math.PI*r);
    }
}