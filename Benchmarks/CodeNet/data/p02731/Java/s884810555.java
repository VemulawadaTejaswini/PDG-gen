import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String [] commandLineArgument){

        Scanner input = new Scanner(System.in);
        int l  = input.nextInt();
        long maxValue = 0;
        for(int i = 1; i <= l - 2; ++i){
            int remain = l - i;
            for(int j = 1; j <= remain - 1; ++j){
                int k = remain - j;
                long volume = i *1l* j * 1l * k;
                maxValue = Math.max(maxValue , volume);
            }
        }
        double answer = (double)maxValue;
        System.out.println(String.format("%.6f" , answer));
        input.close();
    }

}

