import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		int time = 0;
		int min = 0;
		while(3600 <= sec){
			time++;
			sec -= 3600;
		}
		while(60 <= sec){
			min++;
			sec -= 60;
		}
		
		System.out.println(time + ":" +  min + ":" + sec);

	
	}
}