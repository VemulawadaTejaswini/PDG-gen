import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner sc  = new Scanner(System.in);
for(int i=1;;i++) {
	int x= sc.nextInt();
	if(x==0) break;
	System.out.printf("Case %d : %d",i,x);
}
sc.close();
	}
	
}
