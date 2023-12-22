import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
    //読み込みのテンプレ(stringオブジェクトまで)
    
    static int number;
    static int[] linenumbers;
    
    
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Integer that shows the number of the lines
        String strnumber = reader.readLine();
        int number = Integer.parseInt(strnumber);
        
        //System.out.println(number);
        
        int[] linenumbers = new int[number];
        
        for(int i=0;i<number;i++){
            linenumbers[i] = Integer.parseInt((String)reader.readLine());
            
        }
        
        /*System.out.println("読み込み完了");
        for(int i=0;i<number;i++){
            System.out.println(linenumbers[i]);
        }
        */
        
        //以下、配列内の素数の数を数えるalgorithmを記述
        //最終的なreturn値
        int prime_number=0;
        
        
        /*
         配列の数だけforループで繰り返す
         i個目の数字が素数ならprime_number++
         1. まずは3以上の偶数かどうかで判定
         2. つぎに3以上の奇数で割れるかを繰り返し割り切れた時点で終了
         3. 割る数が自分の数と同じになったらbreakして、prime_number++
         */
        
        
        for(int i=0;i<linenumbers.length;i++){
            int p = linenumbers[i];
            if(p == 2 || p== 3){
                prime_number++;
            
            }else if(p%2 == 1){
                int j = 1;
                int division = 3;
                while(p %division != 0){
                    j++;
                    division = 2*j+1;
                    if(division == p){
                        prime_number++;
                    }
                }
            }else{
                //System.out.println("偶数なので無視");
            }
        }
        System.out.println(prime_number);
    }
}