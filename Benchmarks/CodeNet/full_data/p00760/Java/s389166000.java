import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			int y = in.nextInt();
			int m = in.nextInt();
			int d = in.nextInt();
			int res = toNextY(y, m, d) + toMill(y+1);
			System.out.println(res);
		}
	}
	
	public static int toMill(int y){
		int res = 0;
		for(int i=y; i<1000; i++){
			res += (i%3==0) ? 10*20 : (5*20 + 5*19);
		}
		return res;
	}
	
	public static int toNextY(int y, int m, int d){
		int res = 0;
		if(y%3==0){
			res = 20 - d + (10-m)*20;
		}else{
			if(m%2==0){
				res = 19 - d + (10-m)*39/2;
			}else{
				res = 20 - d + 19 + (9-m)*39/2;
			}
		}
		return res+1;
	}
}