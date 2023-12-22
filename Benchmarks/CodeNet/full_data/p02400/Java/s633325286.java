import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.printf("%.5f %.5f", 2 * r * Math.PI, r * r * Math.PI);
        
    }
}
