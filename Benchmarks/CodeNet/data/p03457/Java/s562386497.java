import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N =in.nextInt();
		int[] t = new int[N+1];
		int[] x = new int[N+1];
		int[] y = new int[N+1];
		t[0]=0;
		x[0]=0;
		y[0]=0;
		for(int i=1;i<=N;i++) {
			t[i]=in.nextInt();
			x[i]=in.nextInt();
			y[i]=in.nextInt();
		}
		Boolean flag = true;
		for(int i=0;i<N;i++) {
			int dif = Math.abs(x[i+1]-x[i])+Math.abs(y[i+1]-y[i]);
			int diftime=t[i+1]-t[i];
			if((dif%2)==(diftime%2)&&diftime>=dif) {
				flag = true;
			}else {
				flag =false;
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");		
		}
		
	}

}
