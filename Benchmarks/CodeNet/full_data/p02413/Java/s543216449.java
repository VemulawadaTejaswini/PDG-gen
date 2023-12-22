import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int r, c, num, ssum = 0,total=0;
		int i, j;
		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();
		c = scan.nextInt();
		int[] vsum=new int[c];
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				num = scan.nextInt();
				ssum += num;
				vsum[j]+=num;
				System.out.print(num+" ");
			}
			System.out.println(ssum);
			total+=ssum;
			ssum=0;
		}
		for(i=0;i<c;i++) {
			System.out.print(vsum[i]+" ");
		}
		System.out.println(total);

	}

}