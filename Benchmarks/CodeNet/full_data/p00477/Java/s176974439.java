import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ0554().doIt();
	}
	
	class AOJ0554{
		void doIt(){
			int sum = 0;
			for(int i=0;i<4;i++)sum+=in.nextInt();
			int m = sum/60;
			int s = sum%60;
			System.out.println(m);
			System.out.println(s);
		}
	}
	
	
}