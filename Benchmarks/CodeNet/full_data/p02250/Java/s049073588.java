import java.util.Scanner;
import java.awt.geom.Point2D;
import java.text.DecimalFormat;
class Main{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(sc.hasNext()){
			String temp = sc.next();
			int n = sc.nextInt();
			for(int i = 0 ; i < n ; i++){
				if(temp.contains(sc.next()))System.out.println(1);
				else System.out.println(0);
			}
			
		}
	}
}