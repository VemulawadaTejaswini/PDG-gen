import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
if(a-b<=0) {
	System.out.println("Yes");
}
else {
if((a-b)%500==0) {
	System.out.println("Yes");
}
else {
	System.out.println("No");
}
	}
}
	}