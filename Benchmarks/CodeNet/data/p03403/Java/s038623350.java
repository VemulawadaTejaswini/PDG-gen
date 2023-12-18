import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
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
				if(a[i+1]>0&&a[i+1]>=a[i]||a[i+1]<0&&a[i+1]<=a[i]||a[i]==0) {
					sabunn=0;
				}
				else {
					if(a[i+1]>0&&a[i]<0||a[i+1]<0&&a[i]>0||a[i+1]==0){
						sabunn=a[i]*2;
						if(sabunn<0)
							sabunn=-sabunn;
					}
					else {
						sabunn=(a[i]-a[i+1])*2;
						if(sabunn<0)
							sabunn=-sabunn;
					}
				}
			}
			else if(i==(n-1)) {
				if(a[i]>0&&a[i-1]>=a[i]||a[i]<0&&a[i-1]<=a[i]||a[i]==0) {
					sabunn=0;
				}
				else {
					if(a[i-1]>0&&a[i]<0||a[i-1]<0&&a[i]>0||a[i-1]==0) {
						sabunn=a[i]*2;
						if(sabunn<0)
							sabunn=-sabunn;
					}
					else {
						sabunn=(a[i]-a[i-1])*2;
						if(sabunn<0)
							sabunn=-sabunn;
					}
				}
			}
			else {
				if(a[i]>a[i-1]&&a[i+1]>=a[i]||a[i]<a[i-1]&&a[i+1]<=a[i]||a[i]==a[i-1]) {
					sabunn=0;
				}
				else {
					if(a[i+1]>a[i-1]&&a[i]<a[i-1]||a[i+1]<a[i-1]&&a[i]>a[i-1]||a[i+1]==a[i-1]){

						sabunn=(a[i]-a[i-1])*2;
						if(sabunn<0)
							sabunn=-sabunn;

					}
					else {
						sabunn=(a[i]-a[i+1])*2;
						if(sabunn<0)
							sabunn=-sabunn;
						if(sabunn>a[i]-a[i+1]||sabunn>a[i+1]-a[i]) {
							sabunn=(a[i]-a[i+1])*2;
							if(sabunn<0)
								sabunn=-sabunn;
						}

					}
				}

			}

			System.out.println(shiguma-sabunn);


		}










	}
}
