import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		for(int i=0; i<data; i++){
			int x = 0, y = 0;
			int[] treasure = new int[3];

			while(true){
				int dx = sc.nextInt();
				int dy = sc.nextInt();
				if(dx==0&&dy==0) break;
				x += dx;
				y += dy;
				if(x*x+y*y>treasure[0]){
					treasure[0] = x*x+y*y;
					treasure[1] = x;
					treasure[2] = y;
				}else if(x*x+y*y==treasure[0]&&x>treasure[1]){
					treasure[1] = x;
					treasure[2] = y;
				}
			}
			System.out.println(treasure[1] + " " + treasure[2]);
		}
	}
}