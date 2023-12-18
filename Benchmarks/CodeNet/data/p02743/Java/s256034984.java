
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        long z = in.nextLong();
        double a = Math.sqrt(x);
        double b = Math.sqrt(y);
        double c = Math.sqrt(z);
        if((a+b)<c){
            System.out.println("Yes");
            System.out.println("√" +x +"+" +"√" +y +"<" +"√" +z +"holds.");
            
        }else{
            System.out.println("No");
            System.out.println("√" +x +"+" +"√" +y +"<" +"√" +z +"does not hold.");
        }
    }
    
}
