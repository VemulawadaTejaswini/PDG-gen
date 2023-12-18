import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long k = scanner.nextLong();
		int a[] =new int[100000];
		int b[] =new int[100000];
		boolean judge=true;
		int ans=0;
		
		long bSum=0;
		for(int i=0;i<n;i++){
			a[i]=scanner.nextInt();
			b[i]=scanner.nextInt();
		}
		
		for(int i=0;i<n;i++){
			bSum+=b[i];
			if(bSum>=k&&judge){
				judge=false;
				ans=a[i];
			}
		}

		System.out.println(ans);
	}
}