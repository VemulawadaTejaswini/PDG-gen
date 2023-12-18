import java.util.*;
 
/*
問題文
長さが奇数である文字列 S が以下の条件をすべて満たすとき、S は「強い回文」であるといいます。
 
S は回文である。
N を S の長さとするとき、S の 1 文字目から (N−1)/2 文字目まで(両端含む)からなる文字列は回文である。
S の (N+3)/2 文字目から 
N 文字目まで(両端含む)からなる文字列は回文である。
S が強い回文かどうかを判定してください。
*/
 
 
 
public class Main {
    public static void main(String[] args){
 
        //スキャン
        Scanner s = new Scanner(System.in);
        String text =s.next();
        int textlen = text.length();
        boolean cyc1 = cycloid(text);
        boolean cyc2 = cycloid(
            text.substring(
                0,
                (textlen)/2)
                );
 
 
        boolean cyc3 = cycloid(
            text.substring(
                (textlen+3)/2-1,
                textlen)
            );
 
        if(cyc1 ==true && cyc2 == true && cyc3 == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    
    }
 
    //回文判定処理
    private static boolean cycloid(String hoge){
        //文字列長
        int stLong = hoge.length();
        for(int i=0;i <= stLong/2;i++){
            if(hoge.charAt(i) 
                != 
                hoge.charAt(stLong-1 - i) ){
                    return false;
            };
        } 
        return true;
    }
 
    
}
