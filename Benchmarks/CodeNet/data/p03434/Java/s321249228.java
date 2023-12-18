import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> li = new ArrayList<>();
		for (int i=0; i<N; i++) {
			li.add(Integer.parseInt(sc.next()));
		}
		Collections.sort(li);
		Collections.reverse(li);
		int Alice = 0, Bob = 0;
		for (int i=0; i<N; i++) {
			System.out.println(li.get(i));
			if (i % 2 == 0) Alice += li.get(i);
			else Bob += li.get(i);
		} 
		System.out.println(Alice - Bob);
	}
}