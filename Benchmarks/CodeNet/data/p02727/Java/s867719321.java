import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		List<Integer> red = new ArrayList<Integer>();
		List<Integer> green = new ArrayList<Integer>();
		List<Integer> neet = new ArrayList<Integer>();
		for(int i =0;i < a;i++) {
			red.add(sc.nextInt());
		}
		for(int i =0;i < b;i++) {
			green.add(sc.nextInt());
		}
		for(int i =0;i < c;i++) {
			neet.add(sc.nextInt());
		}
		Collections.sort(red,Comparator.reverseOrder());
		Collections.sort(green,Comparator.reverseOrder());
		Collections.sort(neet,Comparator.reverseOrder());
		List<Integer> answerArray = new ArrayList<Integer>();
		for(int i =0;i < x;i++) {
			answerArray.add(red.get(i));
		}
		for(int i =0;i < y;i++) {
			answerArray.add(green.get(i));
		}
		for(int i =0;i <c;i++) {
			answerArray.add(neet.get(i));
		}
		Collections.sort(answerArray,Comparator.reverseOrder());
		int answer = 0;
		for(int i = 0; i < x +y;i++) {
			answer += answerArray.get(i);
		}
		System.out.println(answer);

	}
}