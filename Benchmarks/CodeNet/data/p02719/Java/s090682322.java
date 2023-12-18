import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        long sabu = 0;
        int cnt = 0;

        long min = Long.MAX_VALUE;

        while(true){
            long num  = Math.abs(n - k);

            if(sabu == n-num){  //(1)絶対値の差が同じ数で連続するなら0に収束
                cnt++;
            }else if(num < min){//最小値の確保
                min = num;
            }else{
                break;
            }

            if(cnt == 3){//(1)で３回連続したら抜ける
                min=0;
                break;
            }
            sabu = n-num;
            n = num;

        }

        System.out.println(min);
    }
}