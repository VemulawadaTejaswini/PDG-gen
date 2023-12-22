import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		int n = sc.nextInt();
		calc(n);
	}
	public void calc(int n){
		int counter = 0;
		String ans = "NO";
		for(int i = 0; i < n; i++){
			String s = sc.next();
			if(s.equals("A")) counter++;
			else if(s.equals("Un")) counter--;
			
			if(counter < 0) break; 
		}
		
		if(counter == 0) ans = "YES";
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}