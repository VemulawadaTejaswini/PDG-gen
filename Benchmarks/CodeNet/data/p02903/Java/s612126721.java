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
		if(H*A!=W*B) {
			System.out.println("No");
			return;
		}
		int[] h=new int[H];
		int[] w=new int[W];
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