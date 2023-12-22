import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int N=sc.nextInt();
			int a, b;
			int[] d=new int[100010];
			int max=0;
			for(int i=1; i<=N; i++) {
				a=sc.nextInt();
				b=sc.nextInt();
				for(int j=a; j<=b; j++) {
					d[j]++;
					max=Math.max(d[i], max);
					
				}//範囲に入るOKな人の数
			}
			int ansmax=0;
			for(int i=2; i<=N+1; i++) {
				if(d[i]==max) {
					ansmax=Math.max(i, max);
				}
				
			}
			if(max==0) max=1;
			System.out.println(max-1);
		}
	}
}

