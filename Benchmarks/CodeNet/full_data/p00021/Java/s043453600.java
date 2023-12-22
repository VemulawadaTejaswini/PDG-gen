import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		double x1 = 0,x2 = 0, x3 = 0, x4 = 0, 
				y1 = 0, y2 = 0, y3 = 0,y4 = 0;
		boolean[] result = new boolean[n];
		for(int i = 0; i<n;i++){
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			x4 = sc.nextDouble();
			y4 = sc.nextDouble();
			if(x1 == x2 && x3 == x4){
				result[i] = true;
			} else if(x1 != x2 && x3 == x4){
				result[i] = false;
			} else if(x1 == x2 && x3 != x4){
				result[i] = false;
			} else {
				if((y1 - y2)/(x1 -x2) == (y3 - y4)/(x3 -x4)){
					result[i] = true;
				} else {
					result[i] = false;
				}
			}
		}
		for(int i = 0; i < n; i++){
			if(result[i] == true){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}