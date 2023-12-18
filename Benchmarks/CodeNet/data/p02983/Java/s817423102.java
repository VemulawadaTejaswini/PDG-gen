import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int R=sc.nextInt();
		int Mi,Mj;
		int answer=Math.floorMod(L*R, 2019);
		sc.close();
		for(int i=L;i<R;i++) {
			if((R-L+1)>=2019) {
				answer=0;
				break;
			}
			for(int j=(i+1);j<=R;j++) {
				Mi=Math.floorMod(i, 2019);
				Mj=Math.floorMod(j, 2019);
				if(Math.floorMod(Mi*Mj, 2019)<answer) {
					answer=Math.floorMod(Mi*Mj, 2019);
				}
			}
		}
		System.out.println(answer);
	}
}