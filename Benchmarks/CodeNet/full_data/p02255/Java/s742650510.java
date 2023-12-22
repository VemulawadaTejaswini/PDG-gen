import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        // カードの枚数
        Scanner scanner = new Scanner(System.in);
        String input_size = scanner.nextLine();
        int size = Integer.parseInt(input_size);
        // カードの数値
        String input_data = scanner.nextLine();
        String[] data = input_data.split(" ");
        // Scannerクラスのインスタンスをクローズ
        scanner.close();       
        // 入れ替え前のデータ出力
        for (int j = 0 ; j < size ; j++){
            if (j == size - 1) {
                System.out.printf(data[j]);
            } else {
                System.out.printf(data[j] + " ");
            }
        }
        System.out.println("");
        // カードした枚数分繰り返し処理
        for(int i = 1 ; i < size ; i++){
            // 比較するカードの数値の代入
            int number = Integer.parseInt(data[i]); // 
            // 比較対象ポイント
            int j = i - 1;
            data[j+1] = String.valueOf(number);  
            
            while( j >= 0 && Integer.parseInt(data[j]) > number ){
                data[j+1] = data[j];
                j--;   
            }
            data[j+1] = String.valueOf(number);
            // 入れ替え処理が終わった度に出力する。
            for (j = 0 ; j < size ; j++){
                if (j == size - 1) {
                    System.out.printf(data[j]);
                } else {
                    System.out.printf(data[j] + " ");
                }
            }
            System.out.println("");
        }
    }
}

