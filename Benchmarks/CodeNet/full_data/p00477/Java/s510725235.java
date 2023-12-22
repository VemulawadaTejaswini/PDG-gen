import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int time = 0;
			for(int i = 0;i < 4;i++){
				time += scan.nextInt();
			}
			System.out.println(time/60 + "\n" + time%60);
		}
	}
}