import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int count = stdIn.nextInt();
		for(int i = 0;i < count;i++){
			int[] ball = new int[10];
			for(int j = 0;j < 10;j++){
				ball[j] = stdIn.nextInt();
			}
			int b = ball[0];
			int c = 0;
			String answer = null;
			for(int j = 1;j < ball.length;j++){
				if(ball[j] < b & ball[j] < c){
					answer = "NO";
					break;
				}
				if(b > c & ball[j] > b){
					b = ball[j];
				}else{
					c = ball[j];
				}
				if(j == ball.length - 1){
					answer = "YES";
				}
			}
			System.out.println(answer);
		}
	}
}