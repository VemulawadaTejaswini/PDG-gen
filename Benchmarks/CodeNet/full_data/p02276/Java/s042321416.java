import java.util.Scanner;

public class Main {

	static int[] a;
	
	static int partition(int a[],int p,int r) {
		int x = a[r];
		int i = p-1;
		for(int j=p;j<r;j++) {
			if(a[j] <= x) {
				i++;
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		int temp = a[r];
		a[r] = a[i+1];
		a[i+1] = temp;
		return i+1;
	}
	
	void main() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[n+1];
		for(int i=1;i<=n;i++) {
			a[i] = sc.nextInt();
		}
		int in = partition(a,1,n);
		if(in == 1) {
			System.out.print("[" + a[1] + "]");
		}else {
			System.out.print(a[1]);
		}
		for(int i=2;i<=n;i++) {
			if(i== in) {
				System.out.print(" "+"[" + a[i] + "]");
			}else {
				System.out.print(" " +a[i]);
			}
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		new Main().main();
	}

}



