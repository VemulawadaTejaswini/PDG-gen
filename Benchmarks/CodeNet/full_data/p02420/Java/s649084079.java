import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		int tr = 0;
		String str = null;
		String strTmp1 = null;
		String strTmp2 = null;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ans = new ArrayList<String>();
		while (true) {
			str = sc.next();
			if(str.equals("-")){
				break;
			}
			 n = sc.nextInt();//?????£??????????????°
			 for(int i = 0; i < n; ++i){
				 tr = sc.nextInt();
				strTmp1 = str.substring(0, tr);
				strTmp2 = str.substring(tr);
				str = (strTmp2+strTmp1);
			 }
				ans.add(str);
		}
		for(int i = 0; i < ans.size(); ++i){
		System.out.println(ans.get(i));
		}
		sc.close();
	}

}