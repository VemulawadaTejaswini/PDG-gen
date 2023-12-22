import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdn = new Scanner(System.in);
		
		int x = 0;
		int t = 1;
		
		for(int i = 0; i <= 1000; i++){
			x = stdn.nextInt();
			if(x != 0){
				System.out.println("Case " + t + ": " + x);
			}else if(x == 0){
				break;
			}
			t++;
		}
	}
}