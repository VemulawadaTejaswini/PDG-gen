import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int x=sc.nextInt();

		int[] cnds=new int[N];
		for(int i=0; i<N; i++) {
			cnds[i]=sc.nextInt();
		}

		Arrays.sort(cnds);
		int ninme=0;

		for(int i=0; i<N; i++) {
			if(x-cnds[i]>=0) {
				x-=cnds[i];
				ninme++;
				if(x==0) {
					System.out.println(ninme);
					System.exit(0);
				}
			}
			else if(x-cnds[i]<0) {
				if(ninme<N) {
					System.out.println(ninme);
					System.exit(0);
				}
				else {
					System.out.println(ninme-1);
					System.exit(0);
				}
			}
		}
		if(x>0) {
			System.out.println(ninme-1);
		}
	}
}


