/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		/*1 時間は 60 分、1 分は 60 秒なので、1 時間は 3600 秒になります。
		これらの定数 3600、60 を基に剰余算（%）や割り算を使って、
		秒の単位から時間、分の単位に変換してみましょう。 */
		Scanner sc = new Scanner(System.in);
		int watchstyle_hms  = sc.nextInt();
		int h = watchstyle_hms / 3600;
        int m = (watchstyle_hms % 3600) / 60;
        int s = ((watchstyle_hms % 3600) % 60);
        System.out.println(h+":"+m+":"+s);
	}
}
