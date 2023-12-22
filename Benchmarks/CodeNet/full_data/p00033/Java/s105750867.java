import java.util.Scanner;
public class Main{
	public static void main(String[] args)throws Exception{
		new Main().solve();
	}
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//the number of test case
		outside:for(int i=0;i<10;i++){
			int[] d=new int[10];
			for(int j=0;j<10;j++){
				d[j]=sc.nextInt();
			}
			int a=-999999;int b=-999999;
			//??????a<=b????????????????????????
			for(int j=0;j<10;j++){
				if(d[j]>b)b=d[j];
				else if(d[j]>a)a=d[j];
				else{
					System.out.println("NO");
					break outside;
				}
				if(a>b){
					int dummy=b;
					b=a;
					a=dummy;
				}
			}
			System.out.println("YES");
		}
	}
}