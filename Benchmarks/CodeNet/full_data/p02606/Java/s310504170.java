import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		int L=scan.nextInt();
		int R=scan.nextInt();
		int d=scan.nextInt();
		int count=0;
		for(int i=L;i<=R;i++) {
			if(i%d==0) {
				count+=1;
			}
		}
		System.out.println(count);
	}

}
