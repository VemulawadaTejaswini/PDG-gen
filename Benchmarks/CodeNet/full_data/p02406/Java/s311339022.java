import java.util.Scanner;

public class Main {
	public static Scanner sc;
	
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int i=1;
		int n=sc.nextInt();
		do {
			int x=i;
			while(true) {
				if(x%3==0) {
					System.out.print(" "+x);
					break;
				}
				if(x%10==3) {
					System.out.print(" "+x);
					break;
				}
			x/=10;
			if(x!=0)continue;
			else break;
			}
		}while(++i<=n);
		System.out.println("");
		
	}
}

