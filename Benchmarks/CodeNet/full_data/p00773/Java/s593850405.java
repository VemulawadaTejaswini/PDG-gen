import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		int x;
		int y;
		int s;
		while(true){
			x = sc.nextInt();
			y = sc.nextInt();
			s = sc.nextInt();
			if(x == 0 && y == 0 && s == 0){
				break;
			}
			calc(x, y, s);
		}
	}
	public void calc(int x, int y, int s){
		int max = 0;
		for(int p1 = 1; p1 <= s/2+1; p1++){
			for(int p2 = 1; p2 < s; p2++){
				int sx = (p1*(100+x))/100 + (p2*(100+x))/100;
				if(sx > s){
					break;
				}
				else if(sx == s){
					int sy = (p1*(100+y))/100 + (p2*(100+y))/100;
					if (sy > max) max = sy;
				}
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}