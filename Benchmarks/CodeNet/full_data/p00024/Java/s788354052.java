import java.util.Scanner;
import java.util.ArrayList;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double lv = scan.nextDouble();
			int n = 1;
			while(true){
				double v = 0;
				v = 1.4*Math.sqrt((double)50*(n-1));
				if(lv <= v){
					System.out.println(n);
					break;
				}
				n++;
			}
		}
	}
}