import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.Math;

class Main{

    public static void main(String[] args){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        
        // 共通変数
        String str;
        boolean debug = false;

        // 課題別変数
        String keyword1 = "the ";
        String keyword2 = "this ";
        String keyword3 = "that ";
        String decodeStr = "";

        try {
            while(debug || reader.ready()){
                str = reader.readLine();

                for (int i = 0; i <= (int)('z' - 'a'); i++) {
                    decodeStr = tryDecode(str, i+1);
                    
                    if (decodeStr.contains(keyword1) || decodeStr.contains(keyword2) || decodeStr.contains(keyword3)){
                        System.out.println(decodeStr);
                    } 
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // ----- 自作関数 ----- //
    private static String tryDecode(String str, int n){
        char[] words = str.toCharArray();
        String decode_words = ""; 
        
        for (int i = 0; i < words.length; i++) {
            if (words[i] >= 'a' && words[i] <= 'z') {
                words[i] += n;
                if (words[i] > 'z') {
                    words[i] += 'a' - 'z'; // はみ出した部分をカット
                    words[i] += 'a' - 'b'; // １文字文ずらす
                }
            }
            decode_words += String.valueOf(words[i]);
        }

        return decode_words;
    }
}
