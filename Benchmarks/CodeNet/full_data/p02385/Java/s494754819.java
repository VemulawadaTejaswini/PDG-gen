
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//サイコロオブジェクトでコンストラクタを作成し、転がしてTOPを表示する。
public class Main {

    public static void main(String[] args) throws IOException {
        // TODO 自動生成されたメソッド・スタ
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");

        int[] a = new int[6];
        int[] b = new int[6];
       for(int i = 0;i < s.length;i++ ){
           a[i] = Integer.parseInt(s[i]);
       }
       for(int i = 0;i < s.length;i++ ){
           b[i] = Integer.parseInt(s2[i]);
       }
       Dice3 diceb = new Dice3(a);
       Dice3 dicea = new Dice3(b);
       while(true){
           if(dicea.equalsMethod(diceb)){
               break;
           }
           diceb.turnN();
           if(dicea.equalsMethod(diceb)){
               break;
           }
           diceb.turnN();
           if(dicea.equalsMethod(diceb)){
               break;
           }
           diceb.turnN();
           if(dicea.equalsMethod(diceb)){
               break;
           }
           diceb.turnW();
           if(dicea.equalsMethod(diceb)){
               break;
           }
           diceb.turnE();
           diceb.turnE();
           if(dicea.equalsMethod(diceb)){
               break;
           }
           System.out.println("No");
           return;
       }

           System.out.println("Yes");
    }

}
class Dice3{
    int TOP,BOTTOM,LEFT,RIGHT,FRONT,BACK;

    Dice3(int[] a){
        this.TOP = a[0];
        this.FRONT = a[1];
        this.RIGHT = a[2];
        this.LEFT = a[3];
        this.BACK = a[4];
        this.BOTTOM = a[5];
    }
    boolean equalsMethod(Dice3 another){
        Dice3 tmp = another;
        if(this.TOP == tmp.TOP){
            if(this.BOTTOM == tmp.BOTTOM){
                for(int i = 0;i < 4;i++){
                 if(this.checkSides(tmp)){
                     return true;
                 }
                 tmp.turnR();
                }
            }
        }
        return false;
    }


     boolean checkSides(Dice3 another) {
        // TODO 自動生成されたメソッド・スタブ
        return this.FRONT == another.FRONT && this.RIGHT == another.RIGHT && this.LEFT == another.LEFT && this.BACK == another.BACK;
    }
    void turnS(){
        int tmp = this.TOP;
        this.TOP = this.BACK;
        this.BACK = this.BOTTOM;
        this.BOTTOM = this.FRONT;
        this.FRONT = tmp;
    }

    void turnN(){
        int tmp = this.TOP;
        this.TOP = this.FRONT;
        this.FRONT = this.BOTTOM;
        this.BOTTOM = this.BACK;
        this.BACK = tmp;
    }

    void turnW(){
        int tmp = this.TOP;
        this.TOP = this.RIGHT;
        this.RIGHT = this.BOTTOM;
        this.BOTTOM = this.LEFT;
        this.LEFT = tmp;
    }

    void turnE(){
        int tmp = this.TOP;
        this.TOP = this.LEFT;
        this.LEFT = this.BOTTOM;
        this.BOTTOM = this.RIGHT;
        this.RIGHT = tmp;
    }
    void turnL() {
        int tmp = this.FRONT;
        this.FRONT = this.RIGHT;
        this.RIGHT = this.BACK;
        this.BACK = this.LEFT;
        this.LEFT = tmp;
    }

    void turnR() {
        int tmp = this.FRONT;
        this.FRONT = this.LEFT;
        this.LEFT = this.BACK;
        this.BACK = this.RIGHT;
        this.RIGHT = tmp;
    }
}
