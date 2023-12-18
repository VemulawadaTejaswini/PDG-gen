import java.util.*;

class Main{

    //メソッドの方で使うからここで宣言しておかなくてはならない
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    static int b = sc.nextInt();
    public static void main(String[] args){
        int re = 0; //結果用
        for(int i = 0; i < 2; i++){
            re = re + Press();
        }
        System.out.println(re);
    }
    
    //比較用メソッド（ボタンが押されたとき）
    public static int Press(){
        if(a > b){
            //メンバ変数は1減らしてもう一回使う（2回比較するから）
            //計算用の戻り値はそのままの値
            a = a - 1;
            return a + 1;
            
           
        //elseなので==の場合もここ
        }else{
            b = b - 1;
            return b + 1;
        }
    }
}