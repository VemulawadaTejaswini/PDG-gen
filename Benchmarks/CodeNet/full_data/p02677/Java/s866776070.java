
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int short_hand=in.nextInt();
        int long_hand=in.nextInt();
        int hour=in.nextInt();
        int minutes=in.nextInt();

        double pai=Math.PI;

        double x=Math.abs(hour*pai/6+minutes*pai/360-minutes*pai/30);  //计算其中度数

        double cos_x=Math.cos(x);   //得到余弦值

        double result_pow2= short_hand*short_hand+long_hand*long_hand-2*short_hand*long_hand*cos_x;

        double result=1.0;
        while(Math.abs(result-result_pow2/result)>1e-10)

        {
            result=(result+result_pow2/result)/2;

        }
        System.out.println(result);




    }
}