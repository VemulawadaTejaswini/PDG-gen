
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int d=sc.nextInt();
      
		int[] ax =new int[h*w];
		int[] ay =new int[h*w];
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				int a=sc.nextInt()-1;
				ax[a]=i+1;
				ay[a]=j+1;
			}
		}
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			int l=sc.nextInt();
			int r=sc.nextInt();

			int hoge =0;

			for(int j=l-1;j<r-1;j+=d) {
              if(ax[j]>ax[j+d]) {
					if(ay[j]>ay[j+d]) {
						hoge+=ax[j]-ax[j+d]+ay[j]-ay[j+d];
					}
					else {
						hoge+=ax[j]-ax[j+d]-ay[j]+ay[j+d];
					}
				}
				else {
					if(ay[j]>ay[j+d]) {
						hoge+=-ax[j]+ax[j+d]+ay[j]-ay[j+d];
					}
					else {
						hoge+=-ax[j]+ax[j+d]-ay[j]+ay[j+d];
					}
				}
			}
			System.out.println(hoge);

		}
	}

}
