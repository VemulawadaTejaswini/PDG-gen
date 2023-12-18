import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String S=stdIn.next();
		int black[]=new int[N];
		int white[]=new int[N];
		int z=0,b=0,w=0,min=N*2;
		while(z<N){
			if(S.charAt(z)=='#')
				w++;
			if(S.charAt(N-1-z)=='.')
				b++;
			white[z]=w;
			black[N-1-z]=b;
			z++;
		}z=0;b=0;
		while(z<N){
			if(z==0)
				b=black[z];
			if(z==N-1)
				b=white[z];
			if(z!=0&&z!=N-1){
				b=white[z]+black[z+1];
			}
			if(b<min)
				min=b;
			z++;
		}
		System.out.println(min);
	}
}
