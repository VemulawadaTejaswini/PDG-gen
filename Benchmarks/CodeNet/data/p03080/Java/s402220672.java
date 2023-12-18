
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());//int型
		String sline = sc.next();
		String[] s = new String[n];
		for (int i=0; i<n; i++){
			s[i] = String.valueOf(sline.charAt(i));
		}
		int r = 0;
		int b = 0;
		for (int i = 0; i<n; i++){
			if (s[i].equals("R")){
				r++;
			} else {
				b++;
			}
		}
		if(r>b) {
			System.out.println("Yes");
		} else if (r<=b) {
			System.out.println("No");
		}
		
	}

}
