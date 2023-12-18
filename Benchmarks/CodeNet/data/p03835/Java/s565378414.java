import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int s = scan.nextInt();

		int x = 0;
		int y = 0;
		int z = 0;
		int count = 0;
		for(x=0;x<=k;x++) {
			for(y=0;y<=k;y++) {
				for(z=0;z<=k;z++) {
					if(x+y==s-z) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
