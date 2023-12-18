import java.util.Scanner;

public class Main{
	static Scanner s = new Scanner(System.in);			//文字の入力

	static String A = s.next();
	static String B = s.next();
	static int a =  Integer.parseInt(A);
	static int b =  Integer.parseInt(B);
static boolean flag = false;

	static int sum =0;

	public static void main(String[] args){
		solve();
	}

	static void solve() {
		int aketa = A.length();
		int bketa = B.length();
		int adata[] =new int[aketa];
		int bdata[] = new int [bketa];
		
		for(int i= 0;i<aketa;i++){
			adata[i] = 0;
		}
		for(int j = 0;j <bketa;j++){
			bdata[j] = 0;
		}		//初期化

		for(int j= 0; j < bketa;j++){
			int kagi=1;
			for(int i = 1;i < bketa-j;i++){
				kagi*=10;
			}
			bdata[j]=b/kagi;
			b -= bdata[j]*kagi;
		}

		for(int j= 0; j < aketa;j++){
			int kagi=1;
			for(int i = 1;i < aketa-j;i++){
				kagi*=10;
			}
			adata[j]=a/kagi;
			a -= adata[j]*kagi;

		}
		
		for(int i = 0;i<aketa;i++){
			int kagi = 1;
			for(int j = 0;j < aketa+bketa-1-i;j++){
			kagi *= 10;
			}
			sum += adata[i]*kagi;
		}
		for(int j= 0; j < bketa;j++){
			int kagi=1;
			for(int i = 1;i < bketa-j;i++){
				kagi*=10;
			}
			sum += bdata[j]*kagi;
			
		}
		
		for(int i =1;(i*i)<=sum;i++){

			if(sum==(i*i)){
				flag = true;
				System.out.println("Yes");
				break;
			}
			
		}
		if (flag != true){
			System.out.println("No");
			
		}

	}





}