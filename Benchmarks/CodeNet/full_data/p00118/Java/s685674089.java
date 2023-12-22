
import java.util.*;
public class Main {
	final char MARK = '+';
	Scanner sc;
	Stack<Integer> xSta;
	Stack<Integer> ySta;
	int w ;
	int h;
	char [][] list;

	private void setSta(int x, int y){
		xSta.push(x);
		ySta.push(y);
	}

	private void set(){
		for(int i=1; i < h + 1; i++){
			String str = sc.next();
			for(int j=0; j < w;j++){
				list[i][j+1] = str.charAt(j);
			}
		}
		//set a flame
		for(int i=0; i < w + 2; i++){
			list[0][i] = MARK;
			list[h+1][i] = MARK;
		}
		for(int i=0; i < h + 2; i++){
			list[i][0] = MARK;
			list[i][w+1] = MARK;
		}
	}

	public void doIt(){
		sc = new Scanner(System.in);
		list = new char[102][102];
		xSta = new Stack<Integer>();
		ySta = new Stack<Integer>();
		while(true){
			h = sc.nextInt();
			w = sc.nextInt();
			if(w == 0 && h == 0){
				break;
			}
			//reset
			for(int i=0; i < 102; i++){
				for(int j=0; j < 102; j++){
					list[i][j] = ' ';
				}
			}
			//set
			set();
			int count = 0;
			for(int i=1; i < h + 1;i++){
				for(int j=1; j < w + 1; j++){
					if(list[i][j] != MARK){
						count++;
						setSta(j, i);
						char patMark = list[i][j];
						while(!xSta.empty()){
							int x = xSta.pop();
							int y = ySta.pop();
							if(list[y][x] != patMark){
							}
							else{
								list[y][x] = MARK;
								setSta(x+1, y);
								setSta(x, y+1);
								setSta(x, y-1);
								setSta(x-1, y);
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}