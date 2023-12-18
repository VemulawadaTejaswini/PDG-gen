import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System .in);
        long num = scan.nextLong();
        long steps = 0; 
        long preStep = (long)Math.pow(10,12);
        long j,d;


        for(long i=(long)num/2;i>=2;i--){
            d = num % i;
            if (d == 0){
                j = num /i;
                steps = Math.min(i+j-2,preStep);
                preStep = steps;
            }
        }
        if ( steps == 0){ steps = num - 1;}
        System.out.println(steps);

        scan.close();
    }

}