import java.util.Scanner;

public class Main {

	static int cnt;
	public static void main(String[] args) {
		Scanner cin  = new Scanner(System.in);
		while(true){
			cnt=0;
			int x =cin.nextInt();
			int y =cin.nextInt();
			if(x+y==0){
				break;
			}
			if(x<y){
				int tmp = x;
				x = y;
				y = tmp;
			}
			System.out.println(yu(x,y)+" "+cnt);
		}
	}
	static int yu(int x,int y){
		
		if(y==0){
			return x;
		}
		else{
			cnt++;
			return yu(y , x%y);
		}
	}
}