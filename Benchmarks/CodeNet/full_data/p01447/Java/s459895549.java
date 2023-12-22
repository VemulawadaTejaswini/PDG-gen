import java.util.Scanner;

//Earth Invasion Diary of Miyabi-sensei
public class Main{

	int f(int n){
		return n<=1?0:(n%3==0?f(n/3):f(n/3+1))+1;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println(f(sc.nextInt()));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}