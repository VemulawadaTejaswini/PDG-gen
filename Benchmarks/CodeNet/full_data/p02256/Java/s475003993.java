import java.util.Scanner;
public class Main {
	Scanner sc = new Scanner(System.in);
	int x,y;	
	int keep=0;
	
	public void input() {
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	public void conpute() {
		if(x > y) {
			while(x%y != 0) {
				keep = x;
				x = y;
				y = keep % y;
			}
			System.out.println(y);
		}else {
			while(y%x != 0) {
				keep = y;
				y = x;
				x = keep % y;
			}
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.conpute();
	}
}

