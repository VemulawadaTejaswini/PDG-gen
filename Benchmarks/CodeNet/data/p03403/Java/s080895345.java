import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n= sc.nextInt();
		int a[]=new int[n];
		long shiguma=0;
		int sabunn=0;


		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(i==0) {
				sabunn=a[i];

			}
			else {
				sabunn=a[i]-a[i-1];

			}

			if(sabunn<0)
				sabunn=-sabunn;

			shiguma+=sabunn;

		}
		sabunn=a[n-1];
		if(sabunn<0)
			sabunn=-sabunn;
		shiguma+=sabunn;

		for(int i=0;i<n;i++) {
			if(i==0) {
				sabunn=returnSabunn(0, a[i], a[i+1]);

			}
			else if(i==n-1) {
				sabunn=returnSabunn(a[i-1], a[i], 0);
			}
			else {
				sabunn=returnSabunn(a[i-1], a[i], a[i+1]);
			}
			System.out.println(shiguma-sabunn);
		}

	}

	public static int returnSabunn(int ichi, int ni, int sann) {
		if(ni>=ichi&&sann>=ni||ni<=ichi&&sann<=ni||ni==ichi||ni==sann) {
			return 0;
		}
		else {
				int sabunnA=ni-sann;
				if(sabunnA<0)
					sabunnA=-sabunnA;
				int sabunnB=ni-ichi;
				if(sabunnB<0)
					sabunnB=-sabunnB;

				if(sabunnA<sabunnB)
					return sabunnA*2;
				else
					return sabunnB*2;

		}
	}

}
