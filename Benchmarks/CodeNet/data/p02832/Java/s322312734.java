import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for(int i = 0; i < N; i++){
			int x = sc.nextInt();
			if(x == (count + 1)){
				count++;
			}
		}
		System.out.println((count == 0)?"-1":N - count);
	}
}