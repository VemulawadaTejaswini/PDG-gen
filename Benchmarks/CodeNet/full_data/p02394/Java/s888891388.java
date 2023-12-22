import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		int Rx1 = (r+x);
		int Rx2 = (x-r);
		int Ry1 = (r+y);
		int Ry2 = (y-r);
		if(x>0 && x<W && y>0 && y<H){
			if(Rx1<=W && Rx2>=0 && Ry1<=H && Ry2>=0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			System.out.println("No");
		}
	}
}