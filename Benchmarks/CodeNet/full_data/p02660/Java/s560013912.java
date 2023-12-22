import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long num = sc.nextLong();
        long div = 2;
        int count = 0;
        while(true){
            if(num % 2 == 0){
                // 割れるならカウントを進めてnumを割る
                num = num / div;
                count++;
                if(num == 1){
                    // 1は最後
                    break;
                }
            }
            div++;
        }
        System.out.println(div);
    }
}