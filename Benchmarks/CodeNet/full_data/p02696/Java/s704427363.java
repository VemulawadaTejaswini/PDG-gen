import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    private static void nCombination3(int c) {
        int count = c;
        int num = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    num++;
                }
            }
        }
    }



    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println(12*Math.log(10)/Math.log(2));
        double A=sc.nextDouble(),B=sc.nextDouble(),N=sc.nextDouble();
        long max = 0;
        long divenum = 1;
        for(int x=1;x<=N;x++){
            long ans = (long)Math.floor(A*x/B)- (long)(A*Math.floor(x/B));
            if(ans > max){
                max = ans;
            }
        }
        System.out.println(max);
    }
}
