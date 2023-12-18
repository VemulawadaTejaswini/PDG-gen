import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int z=0;
		boolean ans=true;
		while(z<N){
			A[z]=stdIn.nextInt();
			z++;
		}z=N-1;
		while(z>0){
			if(A[z]<A[z-1])
				if(A[z-1]-A[z]==1)
					A[z-1]--;
				else{
					ans=false;
					break;
				}
			z--;
		}
		if(ans)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}