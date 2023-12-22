import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static boolean[] p=new boolean[50000];
	public static int counter(int n){
		int c=0,i,j;
		for(i=2;i<=n/2;i++){
			if(p[i])
			for(j=2;i+j<=n;j++){
				if(p[j]){
					if(i+j==n){
						c++;
//						System.out.println(i+" "+j);
					}
				}
			}
		}//
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		Arrays.fill(p, true);
		for(i=2;i<50000;i++){
			if(p[i])
			for(j=2;i*j<50000;j++){
				p[i*j]=false;
			}
		}
		while(true){
			n=sc.nextInt();
			if(n==0) break;
			System.out.println(counter(n));
		}
	}
}