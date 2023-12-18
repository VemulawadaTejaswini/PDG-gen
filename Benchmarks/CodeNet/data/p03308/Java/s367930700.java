import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int a[]=new int[n];
		int min=0,max=0;
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
			if(i==0) {
				min=a[i];
				max=a[i];
			}else {
				if(min>a[i])min=a[i];
				if(max<a[i])max=a[i];
			}
		}
		scan.close();
		System.out.println(max-min);
	}
}
