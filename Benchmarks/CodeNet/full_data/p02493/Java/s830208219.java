import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();
		
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
			int value = sc.nextInt();
			n.add(value);
		}
		for(int i = n.size()-1; i > 0; i--){
			System.out.print(n.get(i) + " ");
		}
		if(n.size() != 0) System.out.println(n.get(0));
	}
	public static void main(String[] args){
		new Main().run();
	}
}