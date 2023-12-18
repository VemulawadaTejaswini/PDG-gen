import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i = 0;i < n; ++i){
			if (i%2 != 0){
				deque.addLast(Integer.parseInt(scan.next()));
			}else{
				deque.addFirst(Integer.parseInt(scan.next()));
			}
		}

		if (n%2 == 0){
			for(int i = 0; i < n; ++i){
				System.out.print(deque.getLast()+" ");
				deque.removeLast();
			}
		}else{
			for(int i = 0; i < n; ++i){
				System.out.print(deque.getFirst()+" ");
				deque.removeFirst();
			}
		}



	}
}
//end
