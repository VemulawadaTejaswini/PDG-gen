import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(gcd(x,y));

	}

	public static int gcd(int x,int y){
		int n=x;
		int r=0;
		if(y<x){
			n=y;
		}
		for(int d=n; d>=1; d--){
			if(x%d==0 && y%d==00){
				r=d;
				break;
			}
		}
		return r;
	}

	}
