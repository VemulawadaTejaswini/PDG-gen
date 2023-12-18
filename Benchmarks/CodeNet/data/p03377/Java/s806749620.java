import java.util.Scanner;

public class q2{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n, m, x;
		n = in.nextInt();
		m = in.nextInt();
		x = in.nextInt();

		String dump = in.nextLine();

		int [] a = new int [m];
		int c1=0, c2;

		for (int i = 0; i < m; i++){
			a[i] = in.nextInt();
			if(a[i] < x){
				c1++;
			}
		}
		c2 = m - c1;
		if(c1 < c2){
			System.out.println(c1);
		}else{
			System.out.println(c2);
		}


	}
}
