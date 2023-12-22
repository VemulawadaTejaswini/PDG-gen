import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n;
        while((n=br.readLine())!=null){
            if("-".equals(n)){
                break;                       // - が入力されたらwhileを抜ける
            }
            String str = n;                  // n で読み取ったものをstrに入れる
            int shuffle = Integer.parseInt(br.readLine());    //shuffleにシャッフル回数を入れる
            for(int i=0; i<shuffle; i++){                     //shuffleの回数分for文が行われる
                int h = Integer.parseInt(br.readLine());      //h にカードの移動位置が入れられる
                str = str.substring(h) + str.substring(0,h);  
                //substringでhの位置から文字を取り出して
                //次のsubstringで移動される文字を取り出して
                //二つのsubstringで取り出した文字をstrに入れている
            }
            System.out.println(str);
        }
    }
}