import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Main main=new Main();
		main.run();
	}

	void run() {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		//隙間の数
		//例えば123だったら1○2○3のように隙間が2つある
		//この隙間に＋を入れるか入れないかで判断する。
		
		//隙間の数は文字の数-1
		int n=str.length()-1;
		
		long ans=0;
		
		
		//隙間の数に対応したビットを全列挙する。
		for(int i=0;i<(1<<n);i++) {
			long sum=0;
			long a=str.charAt(0)-'0';
			
			for(int j=0;j<n;j++) {
				
				if((i>>j)%2==1) {
					
					sum+=a;
					a=0;
					
				}
				
				a=a*10+(str.charAt(j+1)-'0');
				
			}
			
			//ループを抜けた時に格納されている残りを足す。
			sum+=a;
			
			//一回ループが終わったら、結果を足しておく。
			ans+=sum;
			
		}
		
		System.out.println(ans);


	}




}



