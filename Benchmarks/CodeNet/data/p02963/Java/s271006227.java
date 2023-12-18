import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextInt();

        //S= x1 * y2 - y1 * x2
        long max = 1_000_000_000;
        long x1=max, y1 = 1;

        //S= y2 * 10^9 - x2
        long y2 = S/x1;
        long x2 = y2*x1 -S;
        if(x2 < 0){
            y2++;
            x2 = y2*x1 -S;
        }

        System.out.println(String.format("0 0 %d %d %d %d",x1,y1,x2,y2));


    }

}