import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String ans = "NO";
		int[] setu = new int[3];
		for(int i = 0 ;i < setu.length;i++) {
			setu[i] = sc.nextInt();
		}
		for(int i = 0; i < setu.length;i++) {
			for(int j = i; j < setu.length;j++) {
				if(setu[i] > setu[j]) {
					int hoge = setu[i];
					setu[i] = setu[j];
					setu[j] = hoge;
				}
			}
		}
		if(setu[0] == 5 && setu[1] == 5 && setu[2] == 7) {
			ans = "YES";
		}
		System.out.println(ans);
		if(!(sc == null)) sc.close();
	}
}