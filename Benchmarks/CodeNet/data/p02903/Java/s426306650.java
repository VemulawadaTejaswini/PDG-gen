import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		String d1="";
		String d2="";
		String d3="";
		String d4="";
		for(int i=A;i<W;i++) {
			d1+="0";
		}
		for(int i=A;i<W;i++) {
			d2+="1";
		}
		for(int i=0;i<A;i++) {
			d3+="0";
		}
		for(int i=0;i<A;i++) {
			d4+="1";
		}
			int i=0;
			for(;i<B;i++) {
				int j=0;
				System.out.print(d4);
				System.out.print(d1);
				System.out.println();
			}
			for(;i<H;i++) {
				int j=0;
				System.out.print(d3);
				System.out.print(d2);
				System.out.println();
			}
			return;
	}

}