import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	int n;
	int[] a;
	boolean[] b;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			n = scan.nextInt();
			a = new int[n];
			int max = 0;
			for(int i = 0;i < n;i++){
				a[i] = scan.nextInt();
				max += a[i];
			}
			b = new boolean[max+1];
			bruteForce(0,a[0]);
			bruteForce(0,0);
			int q = scan.nextInt();
			int t = 0;
			for(int i = 0;i < q;i++){
				t = scan.nextInt();
				System.out.println((max >= t && b[t])?"yes":"no");
			}
		}
	}
	public void bruteForce(int i,int sum){
		b[sum] = true;
		if(i == n-1){
			return;
		}
		bruteForce(i+1,sum+a[i+1]);
		bruteForce(i+1,sum);
		return;
	}
}