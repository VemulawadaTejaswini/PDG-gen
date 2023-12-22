import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int w = stdIn.nextInt();
		int h = stdIn.nextInt();
		int n = stdIn.nextInt();
		
		int nowx = stdIn.nextInt();
		int nowy = stdIn.nextInt();
		int counter = 0;
		for(int i = 1; i < n; i++) {
			int tox = stdIn.nextInt();
			int toy = stdIn.nextInt();
			if((nowx > tox && nowy < toy) || (nowx < tox && nowy > toy)) {
				counter += Math.abs(nowx - tox) + Math.abs(nowy - toy);
			}
			else {
				counter += Math.max(Math.abs(nowx - tox), Math.abs(nowy - toy));
			}
			nowx = tox;
			nowy = toy;
		}
		System.out.println(counter);
	}

}