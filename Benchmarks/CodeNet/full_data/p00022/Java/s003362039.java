import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int length = sc.nextInt();

            int[][] series = new int[length][2];
            for(int j = 0; j < length; j++){
                series[j][0] = sc.nextInt();
            }

            series[0][1] = series[0][0];

            for(int j = 1; j < length; j++){
                if(series[j-1][1] <= 0){
                    series[j][1] = series[j][0];
                }else{
                    series[j][1] = series[j-1][1] + series[j][0];
                }
            }

            int max = -100001;
            for(int j = 0; j < length; j++){
                if(series[j][1] > max){
                    max = series[j][1];
                }
            }

            System.out.println(max);


        }

    }
}