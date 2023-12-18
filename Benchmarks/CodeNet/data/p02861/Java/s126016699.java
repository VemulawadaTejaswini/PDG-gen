import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int xy[][]= new int[n][2];
		for(int i=0;i<n;i++) {
			xy[i][0] = scan.nextInt();
			xy[i][1] = scan.nextInt();
		}
		scan.close();
		double ans =0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				ans += Math.sqrt((xy[i][0]-xy[j][0])*(xy[i][0]-xy[j][0])+(xy[i][1]-xy[j][1])*(xy[i][1]-xy[j][1]))*2;
			}
		}
		System.out.println(ans/n);
	}
}