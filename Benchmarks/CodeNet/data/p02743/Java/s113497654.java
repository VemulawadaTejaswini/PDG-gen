import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();


        double multi = (double)a * (double)b;
        double right = (double)(c - a - b)/2;

        if( right > 0 && multi < (right * right)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        scan.close();
    }
}