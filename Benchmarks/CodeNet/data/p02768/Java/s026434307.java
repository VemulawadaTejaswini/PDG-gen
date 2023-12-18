import java.util.*;
//23:00s
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int flowerNum =   sc.nextInt();
        int cannotNum1 = sc.nextInt();
        int cannotNum2 = sc.nextInt();
        //Main m = new Main();
        //できる花束の和
        int flowerSum =0;
        for(int i =1; i<= flowerNum;i++){
            if(i == cannotNum1){
                continue;
            } else if(i == cannotNum2){
                continue;
            }
            flowerSum = flowerSum + complex(flowerNum,i);
        }
        System.out.println(flowerSum%(Math.pow(10,9) +7));
    }
    //n個からm個選ぶ組み合わせの和
    public static int complex(int n,int m){
        //組み合わせの和の公式を使う
        return surpMark(n)/(surpMark(m)*surpMark(n-m));
    }
    //階上を計算する
    public static int surpMark(int num){
        if(num == 0){
            return 1;
        }
        int multiSum = 1;
        for(int i=1;i <= num;i++){
            //階上の計算
            multiSum = i*multiSum;
        }
        return multiSum;
    }
    //ある数回数、積を計算する
    public static int multiSumSmallNo(int num,int border){
        int multiSum = 1;
        int cnt = 1;
        int i =num;
        while(cnt <= border){
            //階上の計算
            multiSum = multiSum*i;
            i--;
            cnt++;
        }
        return multiSum;
    }
}
