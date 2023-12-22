/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.ArrayList;
import java.util.List;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	static char cnvChar[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		//文字列読込み
		Scanner sc = new Scanner(System.in);

		//取得
		String scLline  = sc.nextLine();	//1行取得
		System.out.println(scLline);	//debug
		
		//分割
		String[] inTxt = scLline.split("[\\s]+");	//空白で区切る
		int len = inTxt.length;
		int shift;
		
		
		for (int i = 0; i < len; i++) {
			int[] chrs = new int[4];
			int[] diff = new int[3];
			for (int j= 0; j < inTxt[i].length(); j++) {
				if (j > 3) {
					continue;	//4文字以上はいらない
				}
				chrs[j] = cnvEtoN(inTxt[i].charAt(j));
				System.out.print(chrs[j]);
			}
			//System.out.print(" ");
			
			diff[0] = chrs[1] - chrs[0];
			diff[1] = chrs[2] - chrs[1];
			diff[2] = chrs[3] - chrs[2];

			//the	21,9,6	-12,-3
			//                       15, 24
			//this	21,9,10,20	-12, 1, 10
			//                       15, 26
			//that	21,9,1,21	-12,-8, 20
			//                       15, 

			if ((diff[0] == -12 && diff[1] == -3) ||
			    (diff[0] == -12 && diff[1] == 1 && diff[2] == 10) ||
			    (diff[0] == -12 && diff[1] == -8 && diff[2] == 20)) {
				int result = chrs[0] - 19;

				//System.out.print("[");
				//System.out.print(inTxt[i] + ">");

				//System.out.print(cnvNtoE(chrs[0] - result));
				//System.out.print(cnvNtoE(chrs[1] - result));
				//System.out.print(cnvNtoE(chrs[2] - result));
				//System.out.print(cnvNtoE(chrs[3] - result));
				
				//System.out.println(result + "]");
				
				
				//答え出力
				for (int k = 0; k < scLline.length(); k++) {
					char tmp = scLline.charAt(k);

					if (cnvEtoN(tmp) > 0) {
						char res = cnvNtoE(cnvEtoN(tmp) - result);
						System.out.print(res);
					} else {
						System.out.print(tmp);
					}
				}
				return;
				
			}

		}
		
	}
	
	public static char cnvNtoE(int val) {
		if (val > 27) {
			return cnvChar[val - 27];
		}
		if (val < 0) {
			return cnvChar[val + 27];
		}
		return cnvChar[val];
	}
	
	public static int cnvEtoN(char val) {
		try {
			for (int i = 0; i < cnvChar.length; i++) {
				if (cnvChar[i] == val) {
					return i;
				}
			}
			return -1;
		} catch (Exception ex) {
			return -1;
		}
	}
}
