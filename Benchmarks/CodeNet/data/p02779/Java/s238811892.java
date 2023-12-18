import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		long[] a=new long[n];
		int count=0,flag=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					flag=1;
					break;
				}
			}
			if(flag==1)break;
		}
		if(flag==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
