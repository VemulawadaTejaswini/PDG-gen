import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long K = in.nextLong();
        long toPrint = 0L;
        long dif = 1L;
        for(int i=1;i<=K;i++){
            toPrint += dif;
            if(helper(toPrint)>helper(toPrint+dif)) dif *= 10L;
            System.out.println(toPrint);
        }

    }
    public static double helper(long n){
        double s = (double) n;
        double sum = 0.0;
        while(n!=0){
            sum += (double) n%10;
            n = n/10;
        }
        return s/sum;
    }
}