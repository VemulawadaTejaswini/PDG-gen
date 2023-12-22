package SD;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j, n, w, h, x1, y1, x2, y2, x3, y3, result;
		result = 0;
		w = scan.nextInt();
		h = scan.nextInt();
		n = scan.nextInt();
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		for(i = 1; i < n; i++){
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			x3 = x2 - x1;
			y3 = y2 - y1;
			if (x3 * y3 > 0){
				if(x3 < 0){
					x3 *= -1;
				}
				if(y3 < 0){
					y3 *= -1;
				}
				if(x3 > y3){
					result += x3;
				} else {
					result += y3;
				}
			} else {
				if(x3 < 0){
					x3 *= -1;
				}
				if(y3 < 0){
					y3 *= -1;
				}
				result += x3 + y3;
			}
			x1 = x2;
			y1 = y2;
		}
		scan.close();
		System.out.println(result);
	}
}