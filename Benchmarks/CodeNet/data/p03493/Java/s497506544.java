import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=a%10;
a/=10;
int c=a%10;
a/=10;
a%=10;
int ans=Int(a)+Int(b)+Int(c);
System.out.println(ans);
	}

	public static int Int(int i) {

		int op=0;
		if(i==1) {
		op=1;
		}
		
		// TODO 自動生成されたメソッド・スタブ
		return op;
	}
}