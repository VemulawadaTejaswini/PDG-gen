import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[]=new int[1000000000];
		for(int i=0;i<a.length;i++) {
			a[i]=0;
		}
		int check=0;
		for(int i=0;i<n;i++) {
			int num = scan.nextInt();
			if(a[num]==1) {
				check=1;
			}else {
				a[num]=1;
			}
		}
		scan.close();

		System.out.println((check==1)? "NO":"YES");
	}

}