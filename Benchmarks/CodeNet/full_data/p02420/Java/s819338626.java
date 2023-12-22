import java.util.Scanner;

public class Main {
	void main() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.next();
			if(str.equals("-")) break;
			int m = sc.nextInt();
			for(int i=0;i<m;i++) {
				int h = sc.nextInt();
				String head = str.substring(0, h);
				String tail = str.substring(h,str.length());
				str = tail + head;
			}
			System.out.println(str);
		}
			
	}
			public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().main();
	}

}
