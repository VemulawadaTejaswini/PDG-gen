import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String word;
        int count,length;
        
        while(true){
            //文字列
            word = sc.next();
            //文字列が「-」の場合処理終了
            if(word.equals("-")) break;
            //シャッフル回数
            count = Integer.parseInt(sc.next());
            
            StringBuilder sb = new StringBuilder(word);
            for(int i=0; i<count; i++){
                //切る文字の長さ
                length = Integer.parseInt(sc.next());
                //1～length文字目を末尾に追加
                sb.append(sb.substring(0,length));
                //1～length文字目を削除
                sb.delete(0,length);
            }
            System.out.println(sb);
            
        }
    }

}

