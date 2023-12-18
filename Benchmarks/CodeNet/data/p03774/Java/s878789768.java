import java.util.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int c=1, n=0, m=0, f=0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a;
		a = new int[N*N];
		int[] b;
		b = new int[M*M];
		for(int i=0 ; N + N > i ; i++){
			a[i] = sc.nextInt();
		}
		for(int j=0; M + M > j ;j++){
			b[j] = sc.nextInt();
		}
		
		for(int r=0; N > n ;){
			int k = (a[r]-b[0])+(a[r+1]-b[1]);
			if(a[r]==b[0] && a[r+1]==b[1]){
				//
			}else{
				for(int i=2; M > m+1 ;){
					f = (a[r]-b[i])+(a[r+1]-b[i+1]);
					if(a[r]==b[i] && a[r+1]==b[i+1]){
						c = (i/2)+1;
						break;
					}else if(Math.abs(k) > Math.abs(f)){
						if(k + f == 0 || k - f == 0){
							//
						}else{
							/*if(i==8){
								System.out.println(Math.abs(k));
								System.out.println(Math.abs(f));
							}*/
							k = f;
							c = (i/2)+1;
						}
					}
					m++;
					i=i+2;
				}
			}
			System.out.println(c);
			c=1;
			n++;
			r=r+2;
			m=0;
		}
	}
}