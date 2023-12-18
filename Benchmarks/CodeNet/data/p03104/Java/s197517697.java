import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long ret = 0;
		if(A==B) System.out.println(A);
		else {
			for(int i=0;i<31;i++) {
				//System.out.println(ad(B+1,i+1));
				System.out.println(ret);
				if((ad(B+1,i+1)-ad(A,i+1))%2==1){
					ret = ret|(1<<i);
				}
			}
			System.out.println(ret);}
	}
	public static long ad(long v,long rank) {
		if(rank==1) return v/2;
		else {
		long u = (long) Math.pow(2,rank);
		return v%u-(u/2)>0? (v/u)*(u/2)+v%u-(u/2) : v/u*(u/2);
		}
	}
}