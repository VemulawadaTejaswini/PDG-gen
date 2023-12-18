import java.util.Scanner;
import java.math.BigDecimal;
import java.util.*;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BigDecimal dividen = BigDecimal.valueOf(1000000007L);
        List<Integer> list = new ArrayList<>();
        List<BigDecimal> result = new ArrayList<>();
        int prevM = 0;
        if(M > 0){
            prevM = sc.nextInt();
            list.add(prevM);
        }
        int nextM = 0;
        boolean flag = false;
        for(int i = 1; i < M; i++){
            nextM = sc.nextInt();
            if(nextM - prevM == 1){
                //無理
                flag = true;
                break;
            }
            list.add(nextM - prevM - 1);
            prevM = nextM;
        }
        list.add(N - prevM);
        
        BigDecimal finalResult = BigDecimal.ONE;
        if(!flag){
            // 穴で区切った区間ごとにパターン数を求める
            for(int i = 0; i < M + 1; i++){
                // 最初は全部1のパターン
                BigDecimal total = BigDecimal.ONE;
                // 1でいけるパターン
                int num = list.get(i) - 1;
                int count2 = 0;
                BigDecimal resbunbo = BigDecimal.ONE;
                for(int j = num - 1; j >= Math.ceil((double)num / 2.0); j--){
                    count2++;
                    resbunbo = resbunbo.multiply(BigDecimal.valueOf(count2));
                    BigDecimal resbunsi = BigDecimal.ONE;
                    for(int k = 0; k < count2; k++){
                        resbunsi = resbunsi.multiply(BigDecimal.valueOf(j - k));
                    }
                    BigDecimal res = resbunsi.divide(resbunbo);
                    total = total.add(res);
                }
                result.add(total);
            }
            for(int i = 0; i < M + 1; i++){
                finalResult = finalResult.multiply(result.get(i));
                finalResult = finalResult.remainder(dividen);
            }
            System.out.println(finalResult.toPlainString());
        }else{
            System.out.println(0);
        }
        
    }
}
