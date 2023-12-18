import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		ArrayList<Integer> ansList = new ArrayList<>(list);
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			A.add(Integer.parseInt(sc.next()));
			B.add(Integer.parseInt(sc.next()));
			if(list.get(A.get(i) - 1) < list.get(B.get(i) - 1)) {
				if(ansList.contains(list.get(A.get(i) - 1))) {
					ansList.remove(ansList.indexOf(list.get(A.get(i) - 1)));
				}
			}else if(list.get(A.get(i) - 1) > list.get(B.get(i) - 1)) {
				if(ansList.contains(list.get(B.get(i) - 1))) {
					ansList.remove(ansList.indexOf(list.get(B.get(i) - 1)));
				}
			}else {
				if(ansList.contains(list.get(A.get(i) - 1))) {
					ansList.remove(ansList.indexOf(list.get(A.get(i) - 1)));
				}
				if(ansList.contains(list.get(B.get(i) - 1))) {
					ansList.remove(ansList.indexOf(list.get(B.get(i) - 1)));
				}
			}
		}
		sc.close();
		System.out.println(ansList.size());
	}
}