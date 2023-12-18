import java.util.Scanner;
import java.util.Random;

public class Main4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int A,B;
        Random rand = new Random();
        while(true){
            A = rand.nextInt(10000)-5000;
            B = rand.nextInt(10000)-5000;
            if((A^5-B^5)==X){
                System.out.println(A + " "+ B);
                break;
            }else if((B^5-A^5)==X){
                System.out.println(B +" " + A);
                break;
            }
        }
    }
}
