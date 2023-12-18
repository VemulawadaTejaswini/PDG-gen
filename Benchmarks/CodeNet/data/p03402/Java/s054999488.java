import java.util.*;

class Main{
	
	public static int H = 100;
	public static int W = 100;

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean map[][] = new boolean[H][W];
		
		for(int m=0;m<H;m++){
			for(int n=0;n<W;n++){
				map[m][n] = false;
				if(m>=H/2) map[m][n] = true;
			}
		}

		int x=0;
		int y=0;
		for(int n=0;n<A-1;n++){
			map[y][x] = true;
			x += 2;
			if(x >=100){
				y += 2;
				x = 0;
			}
		}
		x = 0;
		y = 51;
		for(int n=0;n<B-1;n++){
			map[y][x] = false;
			x += 2;
			if(x >=100){
				y += 2;
				x = 0;
			}
		}
		answer(map);
	}

	private static void answer(boolean m[][]){
		System.out.println(H +" "+ W);
		for(int h=0;h<H;h++){
			String st="";
			for(int w=0;w<W;w++){
				if(m[h][w]) st += "."; 
				else st += "#";
			}
			System.out.println(st);
		}
	}
}