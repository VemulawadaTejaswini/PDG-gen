import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        long a = in.nextInt ();
        long b = in.nextInt ();
        long k = in.nextInt ();

        if(k <= a){
            System.out.println (a-k+" "+b);
        }else if(k <= a+b){
            System.out.println (0+" "+ (b-(k-a)));
        }else{
            System.out.println (0+" "+0);
        }
    }
}