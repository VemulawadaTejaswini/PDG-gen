import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();
        int T = sc.nextInt();
        int S = sc.nextInt();

        double meTime = (double)D / (double)S;

        if(meTime <= T){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }






    }
}