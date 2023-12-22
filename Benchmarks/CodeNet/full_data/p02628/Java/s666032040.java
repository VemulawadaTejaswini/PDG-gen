import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();  	//入力数
		int k=scan.nextInt();
		int [] price=new int [n];
		for(int i=0;i<n;i++) {
			price[i]=scan.nextInt();
		}

		MixJuice a=new MixJuice(n,k,price);
		System.out.println(a.ans);
	}

}
class MixJuice {
	int n;
	int k;
	int ans;

	MixJuice(int n,int k,int [] p){
		this.n=n;
		this.k=k;
		int min[]=new int [k];

		for(int i=0;i<n;i++) {

			for(int j=0;j<k;j++) {
				if(p[i]==-1) {

				}else if(min[j]==0) {
					min[j]=p[i];
					p[i]=-1;
				}else if(min[j]>p[i]) {

					for(int l=k-1;l>j;l--) {
						int g=min[l-1];
						min[l]=g;  //min[k-0]～min[j+1]=min[k-1]～min[j]
					}
					min[j]=p[i];
					p[i]=-1;
				}

			}

		}


		this.ans=0;
			for(int i=0;i<k;i++) {
				this.ans+=min[i];
			}
	}



