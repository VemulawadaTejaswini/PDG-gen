import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run(){
		ArrayList<Integer> mt = new ArrayList<Integer>();
		for(int i = 0;i < 10; i++){
			mt.add(sc.nextInt());
		}
		Collections.sort(mt, new Comparator<Integer>(){
			@Override
			public int compare(Integer a, Integer b) {
				return b-a;
			}
		});
		for(int i = 0; i < 3; i++){
			System.out.println(mt.get(i));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}