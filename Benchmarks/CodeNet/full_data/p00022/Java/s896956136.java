import java.util.Scanner;
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		for(;;) {
		int max= -100000;
		int n=sc.nextInt();
		if(n==0)break;
		int a[]=new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();

		for(int i=0;i<n;i++) {
			int sum=0;
				for(int j=i;j<n;j++) {
				sum+=a[j];
			max=Math.max(max, sum);
		}
		}
		System.out.println(max);
		}
	}
	}


