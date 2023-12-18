import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int c=0;
		for(int i=1;i<=a;i++) {
			String s=String.valueOf(i);
			if(s.length()%2==1) {
				c++;
			}
		}
		System.out.print(c);

	}

}