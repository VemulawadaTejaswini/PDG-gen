import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//n個の整数
		
		//ArrayList<Long>array=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			long L=sc.nextLong();
			if(L==0) {
				System.out.println(0);
				return;
			}
		}
		
		long t=1;
		long L=1000000L;
		
		for(int i=0;i<n;i++) {
			if(L>1000000L/t) {
				System.out.println(-1);
				return;
			}else {
				t=t*L;
			}
		}
		System.out.print(t);

		sc.close();
	}

}