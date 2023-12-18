import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int n = s.length();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			list.add(Integer.parseInt(s.substring(i,i+1)));
		}


		int count = 0;
		int i = 0;
		while(i < n - 2 ) {
			if (list.size() < 2) {
				break;
			}
			//System.out.println(i + "番目：" + list.get(i));
			//System.out.println(i+1 + "番目：" +list.get(i+1));
			if (list.get(i) != list.get(i + 1))  {
				//System.out.println("aaaaa");
				list.remove(i);
				list.remove(i);
				count = count + 2;
				i = 0;
			} else {
				i++;
			}
		}
		System.out.println(count);


	}

}
