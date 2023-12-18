import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();

		if(r-l+1>=2019)
			System.out.print(0);
		else {
			System.out.print(full(r,l));
		}

	}
	
	public static int full(int r, int l) {
		int saishou = 2018;
		for(int i=l;i<=r;i++) {
			for(int j=i+1;j<=r;j++) {
				if((i*j)%2019 < saishou)
					saishou = (i*j)%2019;
			}
		}
		return saishou;
	}

}