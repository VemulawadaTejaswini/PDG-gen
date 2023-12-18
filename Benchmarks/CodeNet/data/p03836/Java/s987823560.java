import java.util.Scanner;

class Main{

	static	int[] data;
	static boolean[][] used;
	static boolean[][] kariused;
	static int ans = 1000000000;
	static int sx;
	static int sy;
	static int tx;
	static int ty;






	public static void main(String[] args) {






		Scanner sc = new Scanner(System.in);			//文字の入力
		sx = sc.nextInt();
		sy = sc.nextInt();
		tx = sc.nextInt();
		ty = sc.nextInt();
		
		int dx = tx -sx;
		int dy = ty -sy;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i < dx;i++){
			sb.append("R");	
		}
		for(int i = 0;i < dy;i++){
			sb.append("U");
		}
		for(int i = 0;i < dx;i++){
			sb.append("L");	
		}
		for(int i = 0;i < dy;i++){
			sb.append("D");
		}
		sb.append("D");	
		
		for(int i = 0;i < dx+1;i++){
			sb.append("R");	
		}
		for(int i = 0;i < dy+1;i++){
			sb.append("U");
		}
		sb.append("L");
		for(int i = 0;i < dx+1;i++){
			sb.append("L");	
		}
		for(int i = 0;i < dy+1;i++){
			sb.append("D");
		}
		sb.append("R");
		
		String ans = new String(sb);
		System.out.println(ans);

		

		
		
		used = new boolean[2001][2001];
		kariused = new boolean[2001][2001];
		//onedfs(sx,sy,0);



	}
}

class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


