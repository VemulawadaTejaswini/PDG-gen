import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int a[] =new int[100000];
		int b[] =new int[100000];
		
		int bSum=0;
		for(int i=0;i<n;i++){
			a[i]=scanner.nextInt();
			b[i]=scanner.nextInt();
			bSum+=b[i];
			if(bSum>=k){
				System.out.println(a[i]);
				break;
			}
		}

	}
}
