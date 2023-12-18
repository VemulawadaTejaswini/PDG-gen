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
        }else{
            System.out.println("No");
        }
    }
    
}