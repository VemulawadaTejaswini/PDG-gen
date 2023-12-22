import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();//縦線の本数
				int m=sc.nextInt();//横線の本数
				int a=sc.nextInt();//調べる番号
				int[][] yoko=new int[m+1][1010];//今いる縦線と高さ＝移動先縦線
				if(n+m+a==0) {
					break;
				}
				for(int i=0; i<m; i++) {
					int h=sc.nextInt();
					int p=sc.nextInt();
					int q=sc.nextInt();
					yoko[p][h]=q;
				}
				int now=a;
				for(int i=1000; i>=1; i--) {
					if(yoko[now][i]!=0) {
						now=yoko[now][i];
					}
				}
				System.out.println(now);
				
			}

		}
	}
}
