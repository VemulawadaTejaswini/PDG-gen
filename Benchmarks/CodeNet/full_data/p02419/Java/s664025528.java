import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		String W = s.next();
		int count = 0;
		while(true){
			String T = s.next();
			if(T.equals ("END_OF_TEXT")) break;
			if(W.compareToIgnoreCase(T) == 0){
				count++;
			}
		}
			System.out.println(count);
		}

	public static void main(String[] args) {
	
		new Main().run();
		
	}
}