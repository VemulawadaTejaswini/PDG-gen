import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//B
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] ans = new char[H][W];
		boolean[] DepthFlag = new boolean[W];
		boolean[] WidthFlag = new boolean[H];

		for(int i = 0; i < H ; i++){
			String tmp = sc.next();
			if(!tmp.contains("#")){
				WidthFlag[i] = true;
			}
			for(int j = 0 ; j< W ; j++){
				ans[i][j] = tmp.charAt(j);
				if(ans[i][j] == '#'){
					DepthFlag[j] = true;
				}
			}
		}

		String s = "";
		for(int i = 0 ; i < H ; i++){
			for(int j = 0 ; j < W ; j++){
				if(DepthFlag[j] && !WidthFlag[i]){
					s += ans[i][j];
				}
			}
			s += "\n";
		}
		System.out.println(s.trim());

	}
}