import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int[] a = new int[n];

        double res = 0;

        for(int i=0; i<n; i++) {
            res += 1d / sc.nextInt();
        }

        System.out.println(1/res);

    }


}
