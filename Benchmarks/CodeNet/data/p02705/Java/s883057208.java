import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        double L = 2 * Math.PI * R;
        System.out.print(L);
    }
    
}