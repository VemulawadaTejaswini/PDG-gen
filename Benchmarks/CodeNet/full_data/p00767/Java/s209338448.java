import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int h=Integer.parseInt(in.next()),w=Integer.parseInt(in.next());
			if(h==0)break;
			double X=crosspow(h,w);

			int Mmh=101,Mmw=101;
			double mX=crosspow(Mmh,Mmw);
			for(int i=1;i<=150;i++) {
				for(int j=i+1;j<=150;j++) {
					double cx=crosspow(i,j);

					if(cx>X || (cx>=X && i>h)) {
						if(cx<mX || (cx<=mX && i<Mmh)) {
							Mmh=i; Mmw=j;
							mX=crosspow(Mmh,Mmw);
						}
					}
				}
			}

			System.out.println((int)Mmh+" "+(int)Mmw);
		}
	}

	static double crosspow(int a,int b) {
		return Math.pow(a, 2)+Math.pow(b, 2);
	}
}
