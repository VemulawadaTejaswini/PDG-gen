import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> b = new ArrayList<Integer>();
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < a; i++){
			int c = sc.nextInt();
			b.add(c);
		}
		Collections.sort(b);
		for(int i = 0; i < a; i++){
			int d = b.get(i);
			if(i == a-1){
				d = d/2;
			}
			sum += d;
		}
		System.out.println(sum);
	}
}