
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long sum = 1;
        long max = (long)Math.pow(10,18);
        long a;

        for(int i=0;i<n;i++){
            a = scn.nextLong();
            sum = sum*a;
        }
        if(sum>max||sum<0){
            System.out.print(-1);
        }else{
            System.out.print(sum);
        }

    scn.close();


    }


}