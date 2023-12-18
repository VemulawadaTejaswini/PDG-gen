import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int a[]=new int[N];
		int z=0,y=1;
		while(z<N){
			a[z]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(a);
		while(z<N-1){
			if(a[z]!=a[z+1])
				y++;
			z++;
		}
		System.out.println(y);
	}
}
