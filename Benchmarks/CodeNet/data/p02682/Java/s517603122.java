
import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c =scan.nextInt();
        int k = scan.nextInt();

        int sum = 0;
        if(a<=k){
            sum += a;
            k = k - a;
        }
        if ( k > 0){
            k = k - b;
        }

        if(k > 0){

            c = -1*k;
            sum += c;
        }

        System.out.println(sum);

    }
}