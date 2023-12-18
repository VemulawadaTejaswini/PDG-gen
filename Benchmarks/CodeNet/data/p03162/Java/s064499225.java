import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		int c[] = new int[N];
		
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}
		
		int happy[][] = new int[N][3];
		
		for(int j=0;j<3;j++) {
			if(j==0) {
				happy[0][j]=a[0];
			}else if(j==1) {
				happy[0][j]=b[0];
			}else if(j==2) {
				happy[0][j]=c[0];
			}
		}
		
		for(int i=1;i<N;i++) {
			int value[] = new int[3];
			value[0]=a[i];
			value[1]=b[i];
			value[2]=c[i];
			for(int j=0;j<3;j++) {
				happy[i][j]=Math.max(happy[i-1][(j+1)%3]+value[j], happy[i-1][(j+2)%3]+value[j]);
			}
		}
		int max = 0;
		max = Math.max(happy[N-1][0], Math.max(happy[N-1][1], happy[N-1][2]));
		System.out.println(max);
	}

}
