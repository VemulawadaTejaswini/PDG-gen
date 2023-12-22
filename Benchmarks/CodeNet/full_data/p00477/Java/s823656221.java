import java.util.Scanner;

//Total Time
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt();
		System.out.println(s/60+"\n"+s%60);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}