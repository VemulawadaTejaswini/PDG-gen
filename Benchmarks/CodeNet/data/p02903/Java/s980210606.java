
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		if(W==1) {
			for(int i=0;i<H;i++) {
				if(i<B) {
					System.out.println(0);
				}else {
					System.out.println(1);
				}

			}
			return;
		}
		if(H==1) {
			for(int i=0;i<W;i++) {
				if(i<A) {
					System.out.print(0);
				}else {
					System.out.print(1);
				}

			}
			return;
		}
		if(A*H+W*B==A*W+B*H) {
			int i=0;
			for(;i<B;i++) {
				int j=0;
				for(j=0;j<A;j++)System.out.print(0);
				for(;j<W;j++)System.out.print(1);
				System.out.println();
			}
			for(;i<H;i++) {
				int j=0;
				for(j=0;j<A;j++)System.out.print(1);
				for(;j<W;j++)System.out.print(0);
				System.out.println();
			}

			return;
		}
		int[] h=new int[H];
		int[] w=new int[W];
		if(W*B==H*A||W*(H-B)==H*(W-A)||W*(B)==H*(W-A)||W*(H-B)==H*(A)) {
			for(int i=0;i<H;i++) {
	//			System.out.print(i+" ");

				for(int j=0;j<W;j++) {
					if(h[i]<A&&w[j]<B) {
						h[i]++;
						w[j]++;
						System.out.print(0);
					}else {
						System.out.print(1);
					}

				}
				System.out.println();
			}
		}
	}


}