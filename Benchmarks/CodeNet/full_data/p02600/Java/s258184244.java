import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int rating = 0;
		if(400 <= x && x < 600) {
			rating = 8;
		} else if(600 <= x && x < 800){
			rating = 7;
		} else if(800 <= x && x < 1000) {
			rating = 6;
		} else if(1000 <= x && x < 1200) {
			rating = 5;
		} else if(1200 <= x && x < 1400) {
			rating = 4;
		} else if(14000 <= x && x < 1600) {
			rating = 3;
		} else if(1600 <= x && x < 1800) {
			rating = 2;
		} else if(1800 <= x && x < 2000) {
			rating = 1;
		}
		System.out.println(rating);
	}
}
