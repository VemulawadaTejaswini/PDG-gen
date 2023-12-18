import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		long T[]=new long[N];
		int z=0;
		long y=0,x=0;
		while(z<N){
			T[z]=stdIn.nextLong();
			z++;
		}z=0;
		Arrays.sort(T);
		while(z<N-1){
			x=T[z+1];
			while(true){
				if(T[z+1]%T[z]==0)
					break;
				else
					T[z+1]+=x;
			}
			z++;
		}
		System.out.println(T[z]);
	}
}