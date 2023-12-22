import java.util.*;

public class Main {

	int[][] mapA = new int[5][4];
	int[][] mapB = new int[4][5];
	int x, y, d;
	boolean flag;
	
	void U(){
		if(flag==true && y>0 && mapB[y-1][x]==1){
			d=0;
			y--;
			flag = false;
			System.out.print("U");
		}
	}
	
	void R(){
		if(flag==true && x<4 && mapA[y][x]==1){
			d=1;
			x++;
			flag = false;
			System.out.print("R");
		}
	}
	
	void D(){
		if(flag==true && y<4 && mapB[y][x]==1){
			d=2;
			y++;
			flag = false;
			System.out.print("D");
		}
	}
	
	void L(){
		if(flag==true && x>0 && mapA[y][x-1]==1){
			d=3;
			x--;
			flag = false;
			System.out.print("L");
		}
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<9;i++){
			String s = sc.next();
			if(i%2==0){
				for(int j=0;j<4;j++) mapA[i/2][j] = s.codePointAt(j)-48;
			}else{
				for(int j=0;j<5;j++) mapB[i/2][j] = s.codePointAt(j)-48;
			}
		}
		x = 0;
		y = 0;
		d = 1;

		while(true){
			flag = true;
			if(d==0){
				L();
				U();
				R();
				D();
			}else if(d==1){
				U();
				R();
				D();
				L();
			}else if(d==2){
				R();
				D();
				L();
				U();
			}else if(d==3){
				D();
				L();
				U();
				R();
			}
			
			if(x==0 && y==0){
				System.out.println();
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Main.solve();
	}
}