import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.ArrayList;
import java.util.List;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//文字列読込み
		Scanner sc = new Scanner(System.in);

		//取り出し
		String scLline;	//1行
		int len;
		String scChar;

		StringBuffer resultTmp = new StringBuffer();
		ArrayList<String> resultAry = new ArrayList<String>();
		int result = 0;

		while (sc.hasNext()) {
			//文字読込み
			scLline = sc.nextLine();
			len = scLline.length();
			for (int i = 0; i < len; i++) {
				//1文字ずつ取り出し
				scChar = String.valueOf(scLline.charAt(i));

				if (isNumber(scChar)) {
					//数字→resultTmp入れる
					resultTmp.append(scChar);
					//System.out.print(scChar);
				} else {
					//文字→resultTmpあるならresult、ないなら何もしない
					if (resultTmp.length() > 0) {
						resultAry.add(resultTmp.toString());
						resultTmp.setLength(0);	//初期化
					}
					//System.out.print(".");
				}
			}
		}

		//result加算
		//System.out.println(Arrays.asList(result));
		len = resultAry.size();
		
		for (int i = 0; i < len; i++) {
			result += Integer.parseInt(resultAry.get(i));
		}
		System.out.println(result);
		
		
	}

	public static boolean isNumber(String val) {
	try {
		Integer.parseInt(val);
		return true;
	} catch (NumberFormatException nfex) {
		return false;
	}
}
}
