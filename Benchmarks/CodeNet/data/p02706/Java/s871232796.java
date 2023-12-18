import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int hw=sc.nextInt();
		int[] homework=new int[hw];
		int s=0;
		for(int i=1;i<hw;i++) {
			homework[i]=sc.nextInt();
			s=s+homework[i];
		}
		if(d-s<0) {
			System.out.println(-1);
		}
		System.out.print(d-s);
	}

}
