import java.util.Scanner;

public class Main {
	public static boolean move(String s) {
		if(s.equals("R")) {

			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] array = S.split("");
		int[] child = new int[S.length()];
		for(int i=0;i<S.length();i++) {
			child[i] = 1;
		}
		int point = 0;
		for(int i=0;i<10;i++) {
			if(move(array[point])) {
				child[point]--;
				point++;
				child[point]++;
			}else {
				child[point]--;
				point--;
				child[point]++;
			}
			System.out.println(point);
		}
		for(int n:child) {
			System.out.printf("%d",n);
		}
		sc.close();
	}

}
