import java.util.*;

public class AOJ_1153{
    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if( n == 0 && m == 0){
                break;
            }
            int[] taro = new int[n];
            int[] hana = new int[m];
            for(int i = 0; i < n; i++){
                taro[i] = sc.nextInt();
            }
            for(int i = 0; i < m; i++){
                hana[i] = sc.nextInt();
            }
            int sum_t = 0;
            for(int t: taro){
                sum_t += t;
            }
            int sum_h = 0;
            for(int h: hana){
                sum_h += h;
            }
            int diff = sum_t - sum_h;            
            String ans = "-1";
            for(int i = 0; i < n; i++){
                for(int ii = 0; ii < m; ii++){
                    if((taro[i] - hana[ii]) * 2 == diff){
                        ans = taro[i] + " " + hana[ii];
                        break;
                    }
                }
                if(ans != "-1"){
                    break;
                }
            }
            System.out.println(ans);
        }
    }
    public static void main(String[] args){
        new AOJ_1153().run();
    }
}