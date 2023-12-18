import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int z=0,max=0,sec=0,cout=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			if(max<A[z]){
				max=A[z];cout=z;
			}
			z++;
		}z=0;
		while(z<N){
			if(sec<A[z]&&z!=cout)
				sec=A[z];
			z++;
		}z=0;
		while(z<N){
			if(z!=cout)
				System.out.println(max);
			else
				System.out.println(sec);
			z++;
		}
	}
}