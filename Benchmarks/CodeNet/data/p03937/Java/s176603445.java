import java.util.Scanner;

public class Main {
	static String map[][];
	static int h, w;
	static int memo[][];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		h = sc.nextInt();
		w = sc.nextInt();
		map = new String[h][];
		memo = new int [h][w];
		memo[h-1][w-1] = 1;
		for(int i =0;i < h;i++){
			map[i] = sc.next().split("");
		}
		if(search(0, 0))System.out.println("Possible");
		else System.out.println("Impossible");
	}

	static boolean search(int y, int x){
		if(memo[y][x] == 1)return true;
		else if(memo[y][x] == -1)return false;
		boolean under = false;
		boolean right = false;
		if(y+1 <= h-1)
			if(map[y+1][x].equals("#"))under = search(y+1, x);
		if(x+1 <= w-1)
			if(map[y][x+1].equals("#"))right = search(y, x+1);


		if(x == w-1 && y == h-1)return true;
		else {
			if(under || right)memo[y][x] = 1;
			else memo[y][x] = -1;
			return under || right;
		}
	}
}