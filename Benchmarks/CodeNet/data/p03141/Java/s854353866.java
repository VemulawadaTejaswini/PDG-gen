import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[][]=new int[N][N];
		int B[][]=new int[N][N];
		int z=0,y=N-1,x=N-1,fin=-1,s=0,t=0;
		long T=0,AO=0;
		while(z<N){
			A[z][0]=stdIn.nextInt();
			A[z][1]=stdIn.nextInt();
			B[z][0]=A[z][1];
			B[z][1]=A[z][0];
			z++;
		}z=N-1;
		Arrays.sort(A, (a, b) -> Integer.compare(a[0], b[0]));
		Arrays.sort(B, (a, b) -> Integer.compare(a[0], b[0]));
		while(z>=0&&x>=0){
			if(A[z][0]>=0&&s%2==0){
				while(y>=0){
					if(B[y][1]==A[z][0]){
						T+=A[z][0];
						B[y][1]=fin;
						B[y][0]=fin;
						A[z][0]=fin;
						A[z][1]=fin;
						break;
					}
					y--;
				}
				s++;
			}
			y=N-1;
			if(B[x][0]>=0&&s%2==1){
				while(y>=0){
					if(B[x][0]==A[y][1]){
						AO+=B[x][0];
						B[x][1]=fin;
						B[x][0]=fin;
						A[y][0]=fin;
						A[y][1]=fin;
						break;
					}
					y--;
				}
				s++;
			}
			y=N-1;
			if(s%2==0)
				z--;
			if(s%2==1)
				x--;
		}
		System.out.println(T-AO);
	}

}