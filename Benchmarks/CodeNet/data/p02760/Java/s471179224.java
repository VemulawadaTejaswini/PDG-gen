import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a=new int[3][3];
		int count=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int n=sc.nextInt();
		int[] b=new int[n];
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		for(int k=0;k<n;k++) {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(b[k]==a[i][j])a[i][j]=0;
				}
			}
			int sum=0;
			for(int i=0;i<3;i++) {
				sum+=a[i][0]+a[i][1]+a[i][2];
				if(sum==0)count++;
				sum=0;
			}
			for(int i=0;i<3;i++) {
				sum+=a[0][i]+a[1][i]+a[2][i];
				if(sum==0)count++;
				sum=0;
			}
			if(a[0][0]==a[1][1] && a[1][1]==a[2][2]&&a[1][1]==0)count++;
			if(a[0][2]==a[1][1] && a[1][1]==a[2][0]&&a[1][1]==0)count++;
		}
		if(count!=0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}

