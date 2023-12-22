import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		int[][][] res = new int[4][3][10];
		
		for(int i = 0; i < n; i++){
			String[] str = sc.nextLine().split(" ");
			int b = Integer.parseInt(str[0]) - 1;
			int f = Integer.parseInt(str[1]) - 1;
			int r = Integer.parseInt(str[2]) - 1;
			int v = Integer.parseInt(str[3]);
			res[b][f][r] = res[b][f][r] + v;
		}
		
		StringBuilder sb = new StringBuilder();
		final String lb = System.getProperty("line.separator");
		for(int b = 0; b < 4; b++){
			for(int f = 0; f < 3; f++){
				for(int r = 0; r < 10; r++){
					sb.append(" ").append(res[b][f][r]);
				}
				sb.append(lb);
			}
			sb.append("####################").append(lb);
		}

		System.out.print(sb.toString());
	}
}