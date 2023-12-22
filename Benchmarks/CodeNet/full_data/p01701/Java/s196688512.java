import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		while(true){
			String s = sc.next();
			if(s.equals("#")) break;
			calc(s);
		}
	}
	public void calc(String s){
		int[] north = new int[20];
		int n = 0;
		
		String check = s;
		while(check.length()!= 0){
			String part = check.substring(0, 4);
			if(part.equals("west")){
				north[n] = -1;
				check = check.substring(4);
			}
			else{
				north[n] = 1;
				check = check.substring(5);
			}
			n++;
		}
		
		int ans = 0;
		int ansd = 1;
		if(north[n-1] == -1) ans = 90;
		
		for(int i = n-2; i >= 0; i--){
			if(north[i] == 1) {
				ans = 2*ans - 90;
				ansd = 2*ansd;
				if(ans < 0){
					ans = 0;
					ansd = 1;
				}
			}
			else if(north[i] == -1){
				ans = 2*ans + 90;
				ansd = 2*ansd;
			}
		}
		
		while(ans%2 == 0 && ansd%2 == 0){
			ans = ans / 2;
			ansd = ansd / 2;
		}
		
		System.out.print(ans);
		if(ansd != 1) System.out.print("/"+ansd);
		System.out.println();
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}