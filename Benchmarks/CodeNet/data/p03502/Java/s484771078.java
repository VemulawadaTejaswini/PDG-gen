import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int n=X;
		int sum=0;
		int a[]=new int[8];
		for(int i=0;i<8;i++) {
			a[i]=n%10;
			n=n/10;
			sum+=a[i];
		}
		if(X%sum==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
