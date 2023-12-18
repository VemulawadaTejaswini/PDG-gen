import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		Y/=1000;
		int M = 10*N-Y,c=-1,b;
		for(b=0;b*5>M;b++) {
			if((M-b*5)%9==0) {
				c = (M-b*5)/9;
				break;
			}
		}
		if(c==-1) System.out.println("-1 -1 -1");
		else{
			int a = N-b-c;
			System.out.printf("%d %d %d\n",a,b,c);
		}
	}
}