import java.util.Scanner;

// Integral Rectangles
public class Main {

	public void run() {
		Scanner sc = new Scanner(System.in);
		for(;;){
			int h = sc.nextInt(), w = sc.nextInt();
			if((h|w)==0)break;
			int H = 150, W = 150;
			for(int y=1;y<=150;y++)for(int x=y+1;x<=150;x++){
				if (0 < comp(y, x, h, w) && comp(y, x, H, W) < 0){
					H = y; W = x;
				}
			}
			System.out.println(H+" "+W);
		}
	}
	
	public int comp(int y, int x, int h, int w){
		if (h*h + w*w != y*y + x*x) return y*y+x*x - (h*h+w*w);
		return y-h;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}