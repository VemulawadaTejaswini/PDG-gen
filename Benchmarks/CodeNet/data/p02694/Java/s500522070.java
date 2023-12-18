
import java.util.Scanner;

public class Main1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double x = s.nextInt();
        int c = 0;
        for (int b = 100; b < x; b++) {
             b = (int) (b * 1.01);
             c++;
        }
        System.out.println(c+1);

    }
}
