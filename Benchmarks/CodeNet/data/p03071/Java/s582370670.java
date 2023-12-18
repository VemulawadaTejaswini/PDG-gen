import java.util.*;

class Main{

    //メソッドの方で使うからここで宣言しておかなくてはならない
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    public void main(String[] args){
        int re = 0; //結果用
        for(int i = 0; i < 2; i++){
            re = re + Press(a, b);
        }
        System.out.println(re);
    }

    //比較用メソッド（ボタンが押されたとき）
    private int Press(int a, int b){
        if(a > b){
            //メンバ変数は1減らしてもう一回使う（2回比較するから）
            //計算用の戻り値はそのままの値
            this.a = this.a -1;
            return a;
        //elseなので==の場合もここ
        }else{
            this.b = this.b - 1;
            return b;
        }

    }
}