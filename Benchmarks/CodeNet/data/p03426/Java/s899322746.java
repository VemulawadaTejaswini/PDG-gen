
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
		int[] l=new int[q];
		int[] r=new int[q];
		int[]hoge = new int[q];


		for(int i=0;i<q;i++) {
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
			boolean braker=false;

			for(int j=0;j<i;j++) {
				if(l[i]==l[j]&&r[i]==r[j]) {
					System.out.println(hoge[j]);
					braker=true;
				}

			}

			if(braker)
				continue;


			hoge[i] =0;



			if(l==r)
				System.out.println(0);
			else {
				for(int j=l[i]-1;j<r[i]-1;j+=d) {
                  	if(ax[j]>ax[j+d]) {
						if(ay[j]>ay[j+d]) {
							hoge[i]+=ax[j]-ax[j+d]+ay[j]-ay[j+d];
						}
						else {
							hoge[i]+=ax[j]-ax[j+d]-ay[j]+ay[j+d];
						}
					}
					else {
						if(ay[j]>ay[j+d]) {
							hoge[i]+=-ax[j]+ax[j+d]+ay[j]-ay[j+d];
						}
						else {
							hoge[i]+=-ax[j]+ax[j+d]-ay[j]+ay[j+d];
						}
					}
				}
				System.out.println(hoge[i]);
			}
		}
	}

}
