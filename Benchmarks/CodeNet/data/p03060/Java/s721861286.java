import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int V[]=new int[N];
		int z=0,y=0;
		while(z<N){
			V[z]=stdIn.nextInt();
			z++;
		}z=0;
		while(z<N){
			y=stdIn.nextInt();
			V[z]=V[z]-y;
			z++;
		}z=N-1;y=0;
		Arrays.sort(V);
		while(z>=0){
			if(V[z]<=0)
				break;
			y+=V[z];
			z--;
		}
		System.out.println(y);
	}
}