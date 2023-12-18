import java.util.Scanner;
public class Main {

	public static void main(String[] args)throws Exception {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int key;
		int a[]=new int[N+10];
		int b[]=new int[N+10];
		int z=0,y=0,x=0,fin=0;
		int i=1;
		while(N>z) {
			a[z]=stdIn.nextInt();
			b[a[z]]++;
			if(b[a[z]]>2) {
				fin=1;
				break;
			}
			if(b[0]>1) {
				fin=1;
				break;
			}
			z++;
		}z=0;
		if(fin==1)
			System.out.println(0);
		else {
			while(N/2>z) {
				i*=2;
				if(i>1000000007)
					i%=1000000007;
				z++;
			}
			System.out.println(i);
		}
	}
}