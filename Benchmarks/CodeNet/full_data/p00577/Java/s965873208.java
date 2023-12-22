import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
	    char[] c = s.toCharArray();
	    char temp = ' ';

	    int count1 = 0;  //count2が2溜まるごとにcount1を増やす
		int count2 = 0;
		for(int i = 0; i < n; i++) {
			if(c[i] != temp) {
				count2++;
				if(count2 == 2) {
					count1++;
					count2 = 0;  //count2のリセット
					temp = ' ';  //tempのリセット
				}
				else temp = c[i];
			}
		}
		System.out.println(count1);
	}

}

