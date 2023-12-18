import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int h = sc.nextInt();
			int w = sc.nextInt();
			char [][] data = new char[h][w];
			for(int i = 0; i < h; i++){
				data[i] = sc.next().toCharArray();
			}
			
			boolean flg = true;
			int [] dx = {0,1,0,-1};
			int [] dy = {1,0,-1,0};
			for(int i =0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(data[i][j] == '.'){
						continue;
					}
					boolean flg2 = false;
					for(int k = 0; k < 4; k++){
						int xx = j + dx[k];
						int yy = i + dy[k];
						if(0 <= xx && xx < w && 0 <= yy && yy < h){
							if(data[yy][xx] == '#'){
								flg2 = true;
								break;
							}
						}
					}
					if(!flg2){
						flg = false;
						break;
					}
				}
			}
			System.out.println(flg ? "Yes" : "No");
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
