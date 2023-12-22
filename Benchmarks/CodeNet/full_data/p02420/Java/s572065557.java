import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> ansBox=new ArrayList<String>();
		String c="";
		while(true) {//"-"が入力されるまで繰り返す
			//文字列入力
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			int n=str.length();
			if(str.equals("-")) {
				break;
			}
			//シャッフル回数m入力
			int m=Integer.parseInt(sc.next());
			//シャッフルする番号入力//m回シャッフルする
			for(int i=0;i<m;i++) {
				int h=Integer.parseInt(sc.next());
				//strから文字列切り分けた文字a
				String a=str.substring(0,h);
				String b=str.substring(h,n);
				c=b+a;
			}
//			ansBox.add(c);
//			c="";
			System.out.println(c);
		}
//		for(String ans:ansBox) {
//			System.out.println(ans);
//		}
	}

}

