import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1; //一つの整数nが一行に与えられる。
        while(true){
            int x = i;
            if (x % 3 == 0){ //３で割り切れるなら表示
                System.out.print(" " + i);//一行で出力する。
            }
            else{
                while(true){
                    if(x % 10 == 3){ //xを10で割った時余りが3になるときは表示
                        System.out.print(" " + i); //一行で出力する。
                        break;
                    }
                    x /= 10; // x=x/10をしてxが0になるときは動作終わり。
                    if( x == 0 ){
                        break;
                    }
                }
            }
            if(++i <= n){ //iを１ずつ増やしてもnより小さければスキップ
                continue;
            }
            else{
                break;
            }
        }
        System.out.println();
    }
}
