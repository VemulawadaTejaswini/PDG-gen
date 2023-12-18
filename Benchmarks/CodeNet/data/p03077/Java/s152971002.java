import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n;
		long abcde[]=new long[5];
		n=sc.nextLong();
		long cell=n;
		int idx=0;
		for(int i=0;i<5;i++) {
			abcde[i]=sc.nextLong();
		}
		cell=abcde[0];
		for(int i=1;i<5;i++) {
			if(abcde[i]<cell) {
				idx=i;
				cell=abcde[i];
			}
		}
		long ans=(long)Math.ceil(n/(cell*1.0))+4;
		System.out.println(ans);
	}

}
