
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int gokei = Integer.parseInt(scan.nextLine());
        String[] numStr = scan.nextLine().split(" ");
        
        // 文字列配列→数字配列
        Integer[] num = new Integer[gokei];
        for(int i=0;i<gokei;i++){
            num[i] = Integer.parseInt(numStr[i]);
        }
        Arrays.sort(num);
        
        // 一個を除いた数字の最大公約数がそのまま解
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(num);
        Collections.reverse(list);
        
        
        int answer = 0;
        // 除外する数字のループ
        for(int i=0;i<gokei;i++){
            List<Integer> gcdList = new ArrayList<>();
            for(int j=0;j<gokei;j++){
                if(i == j){
                        continue;
                }
                gcdList.add(list.get(j));
            }
            
            Main main =new Main();
            int gcd = main.gcd(gcdList.get(0),gcdList.get(1));    
            
            if(gcdList.size() > 2){
            for(int k = 2;k<gcdList.size();k++){
                gcd = main.gcd(gcdList.get(k),gcd);
            }
            }
            
            if(gcd > answer){
                answer = gcd;
            }
        }


        System.out.println(answer);
    }
    
    private int gcd(int a,int b){
        if(a % b == 0){
            return b;
        }
        
        return gcd(b, a % b);
    }
}
