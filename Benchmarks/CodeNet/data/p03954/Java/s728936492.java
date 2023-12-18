import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int a[] = new int[2*N-1];
		for(int i=0;i<2*N-1;i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			for(int k=i;k<2*N-1;k++) {
				if(a[i]>a[k]) {
					int x = a[k];
					a[k] = a[i];
					a[i] = x;
					}
				
			/*	for(int x=0;x<2*N-1;x++) {
					System.out.print(a[x]);
					
				}
				System.out.println("");
			*/	
			}	
		}
		System.out.println(a[N-1]);


	}

}
