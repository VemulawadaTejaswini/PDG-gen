import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		//スキャナーを宣言する
	    Scanner sc = new Scanner(System.in);

	    //入力を受け取る
	    int r = Integer.parseInt(sc.next());
	    int g = Integer.parseInt(sc.next());
	    int b = Integer.parseInt(sc.next());

	    //スキャナーを閉じる
	    sc.close();

	    //入力値を数字に直す
	    int num = (r * 100) + (g * 10) + b;

	    //もしnumが4で割り切れる(4の倍数)ならば
	    if(num % 4 == 0) {
	    	System.out.print("YES");
	    }
	    else {
	    	System.out.println("NO");
	    }

	}


}