import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	int n;
	int []a;
	boolean[] b;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		n =scanner.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=scanner.nextInt();
		}
		int p = scanner.nextInt();
		b = new boolean[p];
		
		for(int i=0;i<p;i++){
			int temp = scanner.nextInt();
			b[i]=isSum(0, temp);
		}
		for(int i=0;i<p;i++){
			if(b[i]){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
		
	}
	
	public boolean isSum(int i,int m) {
		if(m==0){
			return true;
		}
		if(i==n){
			return false;
		}
		boolean res = isSum(i+1,m)||isSum(i+1, m-a[i]);
		
		return res;
	}
	
}