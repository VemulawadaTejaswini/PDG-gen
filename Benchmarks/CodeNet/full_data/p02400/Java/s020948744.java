import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double S = r * r * Math.PI;
        double L = 2 * r * Math.PI;
        System.out.println(S+" "+L);
        scan.close();
    }
}
