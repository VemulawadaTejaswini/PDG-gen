import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1= sc.nextInt();
		int y1= sc.nextInt();
		int x2=sc.nextInt();
		int y2 =sc.nextInt();
		for (int x3=-200;x3<=200;x3++) {
			for (int y3=-200;y3<=200;y3++) {
				if ((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1)==(y2-y3)*(y2-y3)+(x2-x3)*(x2-x3)) {
					if (x3==x1&&y3==y1) {
						continue;
					}
					int x = x3-x2;
					int y = y3-y2;
					int xa = x2-x1;
					int ya = y2-y1;
					if (x*xa+y*ya!=0) {
						continue;
					}
					if (x2>=x1&&y2>=y1&&x3<=x2&&y3>=y2) {
						int x4 = x3-(x2-x1);
						int y4 = y3-(y2-y1);
						System.out.println(x3+" "+y3+" " +x4+" "+y4);
						return ;
					} else if (x2>=x1&&y2<y1&&y2<x3&&x3>=x2) {
						int x4 = x3-(x2-x1);
						int y4 = y3-(y2-y1);
						System.out.println(x3+" "+y3+" " +x4+" "+y4);
						return ;
					} else if (x2<x1&&y2<y1&&y2>x3&&x3>=x2) {
						int x4 = x3-(x2-x1);
						int y4 = y3-(y2-y1);
						System.out.println(x3+" "+y3+" " +x4+" "+y4);
						return ;
					} else if (x2<x1&&y2>=y1&&y2>=x3&&x3<x2) {
						int x4 = x3-(x2-x1);
						int y4 = y3-(y2-y1);
						System.out.println(x3+" "+y3+" " +x4+" "+y4);
						return ;
					}
				}
			}
		}
	}
}