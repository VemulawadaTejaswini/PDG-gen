import java.io.*;
import java.util.*;



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
            if(p == 2){
                prime_number++;
            }else if(p % 2 == 0){
                //System.out.println("偶数は除く");
            }else if(p < 9){
                prime_number++;
            }else if(p % 3 == 0){
                //3の倍数は除く
            }else{
                for(int j=5;j*j <= p;j+=2){
                    if(p%j == 0){
                    }else{
                        prime_number++;
                    }
                }
            }
        }
        System.out.println(prime_number);
    }
}