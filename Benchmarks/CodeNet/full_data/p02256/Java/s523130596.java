import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int x = scan.nextInt();
			int y = scan.nextInt();
			while(x != 0 && y != 0){
				int t = y;
				y = x;
				x = t % x;
			}
			System.out.println((x == 0)?y:x);
		}
	}
}