import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n,x,total=0;
		int i,j,k;
		Scanner scan = new Scanner(System.in);
		while(true)
		{	
		n=scan.nextInt();
		x=scan.nextInt();
		if(n==0&&x==0)
			break;
		for(i=1;i<=n-2;i++) {
			for(j=i+1;j<=n-1;j++) {
				for(k=j+1;k<=n;k++) {
					if(i+j+k==x)
						total++;
				}
			}
		}
		System.out.println(total);
		total=0;
		}
	}
}

