import java.io.*;
import java.util.*;
class Main{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		while(true){
			int x,y;
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0)break;
			if(x > y){
				x ^= y;
				y ^= x;
				x ^= y;
			}
			System.out.println(x+" "+y);
		}
	}
}