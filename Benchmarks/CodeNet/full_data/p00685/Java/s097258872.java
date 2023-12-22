
import java.util.*;
public class Main {
	int [][] setted;
	int [] xcard;
	int [] ycard;
	int ans;

	private boolean isRange(int x, int y){
		if(x < 0 || x >= 4 || y < 0 || y >= 4){
			return false;
		}
		else{
			return true;
		}
	}

	private void solve(int deep){
		if(deep == 9){
			ans++;
			return ;
		}
		for(int i=0; i < 4; i++){
			for(int j=0; j < 4; j++){
				if(setted[i][j] == 0){
					for(int k=0; k < 4; k++){
						int xdis = xcard[k] + j;
						int ydis = ycard[k] + i;
						if(isRange(xdis, ydis)  && (setted[ydis][xdis] == 0)){
							setted[i][j] = deep;
							setted[ydis][xdis] = deep;

							solve(deep + 1);

							setted[i][j] = 0;
							setted[ydis][xdis] = 0;
						}

					}
					return ;
				}
			}
		}
		return ;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(true){
			xcard = new int[4];
			ycard = new int[4];
			setted = new int[4][4];
			ans = 0;

			int n = sc.nextInt();
			if(n  > 4){
				break;
			}
			xcard[0] = n;
			ycard[0] = sc.nextInt();
			for(int i=1; i < 4;i++){
				xcard[i] = sc.nextInt();
				ycard[i] = sc.nextInt();
			}
			solve(1);
			System.out.println(ans);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}