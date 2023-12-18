import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),p = sc.nextInt(),gu=0,ki=0;
		for(int i=0;i<n;i++)
			if(sc.nextInt()%2==0)gu++;else ki++;
		if(ki==0) System.out.println(p==0?1L<<(n):0);
		else System.out.println(1L<<(n-1));
	}
}