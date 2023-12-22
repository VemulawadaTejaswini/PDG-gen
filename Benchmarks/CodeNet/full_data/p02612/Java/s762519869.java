import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans =0;

        int n = (int)Math.ceil((double)N/(double)1000) *1000;


        System.out.println(n-N);
    }

}