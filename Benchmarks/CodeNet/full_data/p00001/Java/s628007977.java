import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	
	void run(){
		int [] h = new int[10];
		for(int i = 0;i < 10; i++){
			h[i] = sc.nextInt();
		}
		for(int i = 0; i < 3; i++){
			for(int j =i; j < 10; j++){
				if(h[i] < h[j]){
					int temp = h[j];
					h[j] = h[i];
					h[i] = temp;
				}
			}
			System.out.println(h[i]);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}