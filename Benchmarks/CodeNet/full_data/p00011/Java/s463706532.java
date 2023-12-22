import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
// 標準入力からデータを読み込む準備
        try (Scanner sc = new Scanner(System.in)) { 
            int w = sc.nextInt();//たて
            int n = sc.nextInt();//よこ
            int[] values = new int[w];
            
            for (int i = 0; i < values.length; i++) { 
                values[i] = i + 1;
            }//番号の割振り
            
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                String[] ab = str.split(",");//分割

                int a = Integer.parseInt(ab[0]) - 1; 
                int b = Integer.parseInt(ab[1]) - 1;
                 // aとbを使ってvaluesを操作しよう
                int c;

                c=values[a];
               values[a]=values[b];
                values[b]=c;
        }
        for(int q=0;q<values.length ; q++){
        System.out.println(values[q]);
    }
// valuesを出力しよう

        } 
    }
}
  
