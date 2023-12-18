import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int X[]=new int[M];
		int len[]=new int[M-1];
		int z=0,max1=0;
		while(z<M){
			X[z]=stdIn.nextInt();
			z++;
		}z=1;
		Arrays.sort(X);
		while(z<M){
			len[z-1]=X[z]-X[z-1];
			z++;
		}z=0;
		Arrays.sort(len);
		if(M-1-(N-1)>0)
			while(z<M-1-(N-1)){
				max1+=len[z];
				z++;
			}
		System.out.println(max1);
	}
}