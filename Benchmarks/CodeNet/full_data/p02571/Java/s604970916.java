import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();

        char[] charS = new char[S.length()];
        for(int i = 0; i<S.length(); i++){
            charS[i] = S.charAt(i);
            //System.out.println(charS[i]);
        }
        char[] charT = new char[T.length()];
        for(int i = 0; i<T.length(); i++){
            charT[i] = T.charAt(i);
            //System.out.println(charT[i]);
        }

        //完全一致は先に除く
/*        if(S.matches(String.format(".*%s.*", T))){
            System.out.println("0");
        }*/

        //全部調べて、それぞれ何回変更したかをカウントする、[]は調べる回数
        int[] count = new int[S.length()-T.length()+1];


        //この回数ずらしてforを回す
        for(int j = 0; j<S.length()-T.length()+1; j++){
            //それぞれの文字が変更される回数を調べる
            for(int k = 0; k<T.length(); k++){
                if(charS[j+k] != charT[k]){
                    count[j]++;
                }
            }
        }

        Arrays.sort(count);
        System.out.println(count[0]);

    }
}