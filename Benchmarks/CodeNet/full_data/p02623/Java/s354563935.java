import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
		int K = sc.nextInt();
		int[] books = new int[N + M];
		int count = 0;
		for(int i = 0; i < N + M; i++) {
			books[i] = sc.nextInt();
		}
		Arrays.sort(books);

		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int j = 0; j < N + M; j++){
			list.add(books[j]);
		}
		while (K > 0){
		if(K - list.get(0) >= 0){
			K -= list.get(0);
			list.remove(0);
			count++;
		}
		else if(K - list.get(0) < 0){
			K = 0;
		}
		}
		System.out.println(count);
	}	

}