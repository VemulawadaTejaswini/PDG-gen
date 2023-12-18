import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n + 1];
		int y[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			x[i] = sc.nextInt();
		y[i]=x[i];
		}
x[0]=-1;
		Arrays.sort(x);
		int p=-1;
		int q=-1;
		for (int i = 1; i <= n; i++) {
			if(x[i-1]<x[n]/2&&x[n]/2<x[i])
			{
				p=x[i];
				q=x[i-1];
			}
		}
		if(Math.abs(x[n]/2-p)<=Math.abs(x[n]/2-q)){
			p=p;
		}else{p=q;}
		System.out.println(x[n]+" "+p);
	}}