import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	Scanner sc;
	boolean[][] map = new boolean[4][13];
	public void execution(String illust, int level){
		int i;
		if(illust.equals("S")) i = 0;
		else if(illust.equals("H")) i = 1;
		else if(illust.equals("C")) i = 2;
		else i = 3;
		map[i][level-1] = true;
	}
	public void print(){
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				if(!map[i][j]){
					if(i == 0) System.out.println("S "+ (j+1));
					else if(i == 1) System.out.println("H "+ (j+1));
					else if(i == 2) System.out.println("C "+ (j+1));
					else System.out.println("D "+ (j+1));
				}
			}
		}
	}
	public void run(){
		sc = new Scanner(System.in);

		int n = sc.nextInt();
		for(int i =0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				map[i][j] = false;
			}
		}
		for(int i = 0; i < n; i++){
			String illust = sc.next();
			int level = sc.nextInt();
			execution(illust, level);
		}
		print();
	}
	public static void main(String[] args){
		new Main().run();
	}
}