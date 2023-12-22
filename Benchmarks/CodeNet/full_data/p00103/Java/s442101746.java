/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
import java.util.ArrayList;
import java.util.List;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
	//文字列読込み
	Scanner sc = new Scanner(System.in);

	//結果格納
	int point = 0;
	int runner = 0;
	int out = 0;
	String result;

            sc.nextInt();	//イニング数(何につかうか｡｡｡

	while (sc.hasNext()) {
	            //1行読込み
	            result = sc.next();
	            
		
		if (result.equals("HIT")) {
			runner = runner + 1;
			if (runner > 3) {
				runner = 3;
				point = point + 1;
			}
			//System.out.println(runner + " " + point + " " + out );

		} else if (result.equals("OUT")) {
			out = out + 1;
			if (out > 2) {
				//点を出力
				System.out.println(point);  

				//初期化
				point = 0;
				runner = 0;
				out = 0;
			}
			//System.out.println(runner + " " + point + " " + out );
			
		} else if (result.equals("HOMERUN")) {
			point = point + runner + 1;
			runner = 0;
			//System.out.println(runner + " " + point + " " + out );
			
		} else {
		}

	}
	
	//System.out.println(Math.round(price));         

    }
}
