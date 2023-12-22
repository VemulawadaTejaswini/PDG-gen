import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		new Main();	
	}
 
	public Main() {
		new aoj510().doIt();
	}
	class aoj510{
		void doIt(){
			int S = 0,T = 0;
			for(int i = 0;i < 4;i++)S = S + sc.nextInt();
			for(int i = 0;i < 4;i++)T = T + sc.nextInt();
			System.out.println(Math.max(S,T));
		}
	}
}