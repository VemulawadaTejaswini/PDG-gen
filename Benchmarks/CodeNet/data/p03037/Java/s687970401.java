import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int z=0,L=0,R=0,min=0,max=100001;
		while(z<M){
			L=stdIn.nextInt();
			R=stdIn.nextInt();
			if(min<L)
				min=L;
			if(max>R)
				max=R;
			z++;
		}
		if(max-min+1>=0)
			System.out.println(max-min+1);
		else
			System.out.println(0);
	}
}