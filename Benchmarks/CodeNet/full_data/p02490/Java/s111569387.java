import java.util.*;

public class Main {
	public static void main(String args[]){
		
		while(true){
			Scanner s = new Scanner(System.in);
			int x = s.nextInt();
			int y = s.nextInt();
			if(x==0 && y==0) break;
			else if(x>y){
				int tmp = y;
				y = x;
				x = tmp;
			}
			System.out.println(x+" "+y);
		}
	}
}