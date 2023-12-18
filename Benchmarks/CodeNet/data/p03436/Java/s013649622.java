import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int h, w;
		h = sc.nextInt();
		w = sc.nextInt();
		
		char[][] x = new char[h][w];
		int total = 0;
		int judge = 0;
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				char y = sc.next().charAt(0);
				x[i][j] = y;
			}
		}
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(x[i][j] == '#'){
					int count = 0;
					total++;
					count++;
					if(count == j){
						System.out.println("-1");
						judge++;
						break;
					}
				}
			}
		}
		if(judge == 0){
			int ans = h * w - total - (h + w -1);
			System.out.println(ans);
		}
	}
}
