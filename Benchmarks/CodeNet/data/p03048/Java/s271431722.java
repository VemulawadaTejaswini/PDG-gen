import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int ans=0;
		for(int i=0;i<=d;i++) {
			for(int j=0;j<=d;j++) {
				int r=a*i;
				int g=b*j;
				if((d-(r+g))%c==0&&d-(r+g)>=0){
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}