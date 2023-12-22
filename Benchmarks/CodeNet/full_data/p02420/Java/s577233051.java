import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.next();
			if(s.equals("-"))break;  //'-'を入力すると終了
			int m = sc.nextInt(); //シャッフル回数
			for (int i=0; i<m; i++) {
				int h = sc.nextInt(); //取り出す数を指定
				String temp = s.substring(h,s.length());
				temp += s.substring(0,h);
				s = temp;
			}
			System.out.println(s);
		}
	}
}

