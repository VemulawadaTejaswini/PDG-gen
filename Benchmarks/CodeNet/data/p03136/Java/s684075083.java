import java.util.Arrays;
import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
Arrays.sort(a);
		int sum=0;
for(int i=0;i<n-1;i++)sum+=a[i];
	if(a[n-1]<sum) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}

	}
	}