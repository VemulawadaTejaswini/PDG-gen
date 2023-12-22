import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int kk = sc.nextInt();
		
		char[][] map = new char[h][w];
		for(int i=0; i<h; i++){
			String str = sc.next();
			map[i] = str.toCharArray();
		}
		int ans=0;
		for(int i = 0; i < (Math.pow(2, h)); i++){
			for(int j=0;j < (Math.pow(2, w)); j++){
				int black=0;
				for(int k=0; k<h; k++){
					for(int l=0; l<w; l++){
						if(((i>>k)&1)==0 && ((j>>l)&1)==0 && map[k][l]=='#'){
							black++;
						}
					}
				}
				if(black==kk){
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
