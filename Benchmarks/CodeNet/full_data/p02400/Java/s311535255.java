import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //String = データの型。主に文字列を扱う。
        String str = br.readLine();

        //今回はdouble型に変換
        double r = Double.parseDouble(str);

        double menseki	=(double)r * (double)r * 3.141592653589;	//menseki(半径[r]*半径[r]*π)
		double ensyu	=(double)2 * 3.141592653589 * (double)r;	//ensyu(2*π*半径[r])

		 /*今回は桁数出すためprintfを使用
		  * % = 文字表示用
		  * d = 10進数の整数
		  * %d = 10進数の整数を文字表示、みたいな使い方
		  * .6で小数点以下を6桁表示してる
		  * \nは改行用
		  */
		 System.out.printf("%.6f %.6f\n", menseki, ensyu);
    }
}