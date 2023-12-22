import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<String> us = new ArrayList<String>();
		for(int i = 0; i < n; i++){
			String u = sc.nextLine();
			us.add(u);
		}
		int m = sc.nextInt();
		int open = 0;
		sc.nextLine();
		for(int i = 0; i < m; i++){
			String t = sc.nextLine();
			if(us.contains(t)){
				if(open == 0){
					open = 1;
					System.out.println("Opened by " + t);
				}
				else if(open == 1){
					open = 0;
					System.out.println("Closed by " + t);
				}
			}
			else{
				System.out.println("Unknown " + t);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}