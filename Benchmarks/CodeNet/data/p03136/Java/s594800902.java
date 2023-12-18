import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int L[]=new int[N];
		int z=0,max=0,plu=0;
		while(z<N){
			L[z]=stdIn.nextInt();
			plu+=L[z];
			if(L[z]>max)
				max=L[z];
			z++;
		}z=0;
		if(max<plu-max)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}