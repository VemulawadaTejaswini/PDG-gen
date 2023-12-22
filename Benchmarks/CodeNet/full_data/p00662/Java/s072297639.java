import java.util.Scanner;

//The Great Summer Contest
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt();
			if((a|b|c|d|e|f)==0)break;
			int g = a+d, h = b+e, i=c+f;
			int m = Math.min(g, Math.min(h, i));
			System.out.println(m+(g-m)/3+(h-m)/3+(i-m)/3);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}