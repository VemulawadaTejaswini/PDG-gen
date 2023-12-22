import java.io.*;
import java.util.*;
 
 
 
class Main{
    //読み込みのテンプレ(stringオブジェクトまで)
     
    static int N;
    static String[] string;
    static int[] number;
    static final String stable= "Stable";
    static final String unstable = "Not stable";
     
     
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
         
        //それぞれの文字列が持つデータの配列を確保する
        String[] string = new String[N];
        int[] number = new int[N];
        int[] ans_number_bub = new int[N];
        int[] ans_number_select = new int[N];
         
        //suitの順序
        String[] input_suit = new String[N];
        String[] output_suit_bub= new String[N];
        String[] output_suit_select= new String[N];
         
        for(int i=0;i<N;i++){
            string[i] = scanner.next();
             
            //柄の文字列の抽出
            String suit = string[i].substring(0,1);
            input_suit[i] = suit;
            output_suit_bub[i]=suit;
            output_suit_select[i]=suit;
             
            //数字を文字列として抽出してint型に変換する
            String stringnumber = string[i].substring(1);
             
            number[i]=Integer.parseInt(stringnumber);
            ans_number_bub[i] = Integer.parseInt(stringnumber);
            ans_number_select[i] = Integer.parseInt(stringnumber);
        }
         
        //bubblesortを実行する
         
        for(int i=0;i<N-1;i++){
                for(int j=N-1;j>i;j--){
                    if(ans_number_bub[j] < ans_number_bub[j-1]){
                        //文字列の入れ替え
                        String a = output_suit_bub[j];
                        String b = output_suit_bub[j-1];
                        output_suit_bub[j]=b;
                        output_suit_bub[j-1]=a;
                         
                         
                        int x = ans_number_bub[j];
                        int y = ans_number_bub[j-1];
                        ans_number_bub[j] = y;
                        ans_number_bub[j-1]= x;
                    }
                }
        }
        //カードの出力(答え)
        for(int i=0;i<N-1;i++){
            System.out.print(output_suit_bub[i]+ans_number_bub[i]+" ");
        }System.out.println(output_suit_bub[N-1]+ans_number_bub[N-1]);
         
         
        judgeStable(number,ans_number_bub,input_suit,output_suit_bub);
         
         
     
         
         
         
         
        //selectsort実行する
        for(int i =0;i<N;i++){
                int minimum = i;
                for(int j= i+1;j<N;j++){
                    if(ans_number_select[minimum] > ans_number_select[j]){
                        minimum = j;
                    }
                }
             
            //文字列の入れ替え
            String a = output_suit_select[i];
            String b = output_suit_select[minimum];
            output_suit_select[i]=b;
            output_suit_select[minimum]=a;
             
            if(i != minimum){
                //数値の入れ替え
                int x = ans_number_select[i];
                int y = ans_number_select[minimum];
                ans_number_select[i]=y;
                ans_number_select[minimum]=x;
            }
            //minimumから順にi番目に入れていく
            //System.out.println(output_suit_select[i]);
        }
         
        //カードの出力(答え)
        for(int i=0;i<N-1;i++){
            System.out.print(output_suit_select[i]+ans_number_select[i]+" ");
        }System.out.println(output_suit_select[N-1]+ans_number_select[N-1]);
         
        judgeStable(number,ans_number_select,input_suit,output_suit_select);
         
     
    }
     
    //安定性の判別のメソッド（printするのでvoid）
    public static void judgeStable(int[] number,int[] answer,String[] input,String[] output){
        boolean judgment = true;
        //数値1~13で絞るべきか。
        for(int i=1;i<14;i++){
            String before = "";
            String after = "";
             
            //数字iを持つ文字列（before）
            for(int j=0;j<number.length;j++){
                if(number[j] == i){
                    before += input[j];
                }
            }
             
            //数字iを持つ文字列（after）
            for(int j=0;j<number.length;j++){
                if(answer[j] == i){
                    after += output[j];
                }
            }
             
             
        //数字iでの判定
            if(before.equals(after)){
                judgment = true;
            }else{
                judgment = false;
                break;

            }
        }
        if(judgment)System.out.println(stable);
        if(judgment==false)System.out.println(unstable);
         
         
    }
}