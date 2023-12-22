import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		for(;;){
			if(!sc.hasNextInt()) break;
			int a = sc.nextInt() + sc.nextInt();
			System.out.println(1+(int)Math.log10(a));
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}