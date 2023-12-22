import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int score = 0;
			int t = 0;
			for(int i = 0;i < 5;i++){
				score += ((t = scan.nextInt()) < 40)?40:t;
			}
			System.out.println(score/5);
		}
	}
}