import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		new Main().run();
	}

	long[] a;
	long a1;
	int n;
	int x;
	
	void run(){
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		x = sc.nextInt();
		a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextLong();
		}
		a1 = a[0];
		Arrays.sort(a);
		
		long asum = 0;
		long xmax = 0;
		for(int i=0;i<n;i++){
			long tmp = a[i];
			int tmp4 = i;
			for(int j=0;j<n;j++){
				long tmp3 = 0;
				if(i>j){
					tmp3 = i-j;
				}else if(j>i){
					tmp3 = n-(j-i);
				}
				long tmp2 = a[j] + x*tmp3;
				if(tmp2<tmp){
					tmp = tmp2;
					tmp4 = j;
					xmax = Math.max(xmax, tmp3);
				}
			}
			asum += a[tmp4];
		}
		
		System.out.println(asum+x*xmax);
	}

}
