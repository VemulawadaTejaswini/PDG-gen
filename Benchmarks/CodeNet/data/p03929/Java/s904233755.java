import java.util.*;
public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String __[]){
		int n=s.nextInt()-2,k=s.nextInt(),npar11=n/11,nmod11=n%11;

		int count1=0,count2=0;
		for(int i=0;i<11;i++) {
			for(int j=0;j<5;j++) {
//				System.out.printf("%2d ",get(i,j)%11);
				if(get(i, j)%11==k)
					count1++;
			}
//			System.out.println();
		}
		for(int i=0;i<nmod11;i++) {
			for(int j=0;j<5;j++)
				if(get(i, j)%11==k)
					count2++;
		}
		System.out.println(count1*npar11+count2);
	}
	static final long get(int y,int x) {
		return (7*y+x)*9+81;
	}
}
