import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		char[] s = sc.next().toCharArray();
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();

		for(int i = 0; i < s.length;  i++){
			if(i % 2 == 0){
				a.add(String.valueOf(s[i]));
			}else{
				b.add(String.valueOf(s[i]));
			}
		}

		if(!a.contains("L") && !b.contains("R")){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		sc.close();
	}
}
