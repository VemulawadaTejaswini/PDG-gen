import java.util.Scanner;

public class Main {

    public static void main(String[] argv){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(findAroundSquer(n));
    }


    public static int findAroundSquer (int n){
        int a = (int) Math.sqrt(n);

        int b = Math.min(
                Math.abs( n - (a*a)),
                Math.abs(n - ((a+1) * (a+1)))
        );

        if (b == Math.abs( n - (a*a))){
            return a * a;
        }

        return ((a+1) * (a+1));
    }
}
