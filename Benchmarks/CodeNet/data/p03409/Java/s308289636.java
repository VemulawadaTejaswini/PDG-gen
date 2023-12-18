import java.util.Scanner;
import java.awt.Point;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point[] small=new Point[n];
		Point[] big=new Point[n];
		int ans=0;
		for(int i = 0; i<n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			small[i]=new Point(a,b);
		}
		for(int i = 0; i<n; i++){
			int c = sc.nextInt();
			int d = sc.nextInt();
			big[i]=new Point(c,d);
		}
		Arrays.sort(small, (pt1, pt2) -> (pt2.y - pt1.y));
		Arrays.sort(big, (pt1, pt2) -> (pt1.x - pt2.x));
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				if(big[i].y>small[j].y && big[i].x>small[j].x){
					ans++;
					small[j].y=(2*n)+1;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}