import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long K = sc.nextLong();
		int[] A = new int[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt()-1;
		}

		//ループを探す
		List<Integer> loop = new ArrayList<>();
		int index = 0;
		int time = 0;
		while(!loop.contains(index)) {
			loop.add(index);
			index = A[index];
			time++;
		}

		int del_index = 0;
		while(del_index != index) {
			loop.remove(loop.indexOf(del_index));
			del_index = A[del_index];
		}

		if(K <= time) {
			System.out.println(A[(int)K-1]);
			return;
		}

		long loop_size = (long)loop.size();
//		System.out.println("loop_size:" + loop_size);

		int ans_time = (int)(K % loop_size);
//		System.out.println("ans_time: " + ans_time);

		int ans_index = 0;
		for(int i=0; i<ans_time; i++) {
			ans_index = A[ans_index];
		}

		System.out.println(ans_index+1);
	}

}
