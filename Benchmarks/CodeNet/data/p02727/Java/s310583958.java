import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] red = new int[a];
		int[] green = new int[b];
		int[] neet = new int[c];
		for(int i =0;i < a;i++) {
			red[i] = sc.nextInt();
		}
		for(int i =0;i < b;i++) {
			green[i] = sc.nextInt();
		}
		for(int i =0;i < c;i++) {
			neet[i] = sc.nextInt();
		}
		Arrays.sort(red);
		Arrays.sort(green);
		Arrays.sort(neet);
		int[] answerArray = new int[x + y];
		int r = red.length-1;
		for(int i =0;i < x;i++) {
			answerArray[i] = red[r];
			r--;
		}
		int g = green.length-1;
		for(int i =x;i < x+y;i++) {
			answerArray[i] = green[g];
			g--;
		}
		Arrays.sort(answerArray);
		int n = neet.length-1;
		for(int i =0; i < c; i++) {
			if(neet[n] > answerArray[i]) {
				answerArray[i] = neet[n];
				n--;
			}else {
				break;
			}
		}
		Arrays.sort(answerArray);
		int answer = 0;
		int index = x + y -1;
		for(int i = 0; i < x +y;i++) {
			answer += answerArray[index];
			index--;
		}
		System.out.println(answer);

	}
}