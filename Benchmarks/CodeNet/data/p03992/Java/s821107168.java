import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		String b = scan.nextLine();

		String c[] = b.split(" ");

		int d[] = new int[c.length];

		for(int i=0;i<d.length;i++) {
			d[i] = Integer.parseInt(c[i]);
		}

		int count=0;

		for(int i=0;i<a;i++){
			for(int j=i+1;j<a;j++) {
				if(d[i]<d[j]) {
					count++;
				}
			}
		}
		System.out.print(count);

	}

}
