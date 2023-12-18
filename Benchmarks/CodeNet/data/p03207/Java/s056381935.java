import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int z=0;
		int p[]=new int[N];
		int max=0;
		int y=0;
		int plus=0;
		while(z<N){
			p[z]=stdIn.nextInt();
			if(p[z]>max){
				y=z;
				max=p[z];
			}
			z++;
		}z=0;
		while(z<N){
			if(y==z)
				plus+=p[z]/2;
			else
				plus+=p[z];
			z++;
		}
		System.out.println(plus);
	}
}
