import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<n/2;i++) {
			for(int j=i+1;j<n;j++) {
				if(i+j==n)count++;
			}
		}
		System.out.println(count);
	}
}