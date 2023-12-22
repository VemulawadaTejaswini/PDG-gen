import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,x,y,tmp;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(y>x){
			tmp = x;
			x = y;
			y = tmp;
		}
		while(true){
			if(x%y == 0) {
				System.out.println(y);
				System.exit(0);
			}
			tmp = y;
			y = x % y;
			x = tmp;
		}
	}

}

