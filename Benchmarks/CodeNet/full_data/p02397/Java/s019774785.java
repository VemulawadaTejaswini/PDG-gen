import java.util.Scanner;
public class Main {
	void swap(){
		int x,y;
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		y = s.nextInt();
		while(x != 0 || y != 0){
			if(x < y){
				System.out.println(x + " " + y);
			}else{
				System.out.println(y + " " + x);
			}
			x = s.nextInt();
			y = s.nextInt();
		}
	}
	public static void main(String args[]){
		Main m = new Main();
		m.swap();
	}
}