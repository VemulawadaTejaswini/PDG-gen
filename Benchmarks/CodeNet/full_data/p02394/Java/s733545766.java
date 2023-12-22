import java.util.Scanner;
public class Main{
	public static void Main(String[] args){
		Scanner sc = new Scanner(System.in);
		int W = 0;
		int H = 0;
		int x = 0;
		int y = 0;
		int r = 0;
		W = sc.nextInt();
		H = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		r = sc.nextInt();
		
		if(x<W && x>0 && y<H && y>0 && (2*r)<W && (2*r)<H){
			System.out.println("Yes");
		}else if(x>=W && x>0 || y>=H && y>0 && (2*r)<W && (2*r)<H){
			System.out.println("No");
		}
	}
}