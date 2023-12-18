import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long [] X = new long[N];
		ArrayList<Long> list = new ArrayList<Long>();
		for(int i=0;i<N;i++){
			X[i] = sc.nextLong();
			list.add(X[i]);
		}
		Collections.sort(list);
		long ans1,ans2;
		ans1 = list.get(N/2-1);
		ans2 = list.get(N/2);
		for(int i=0;i<N;i++){
			if(X[i]<=ans1)
				System.out.println(ans2);
			else
				System.out.println(ans1);
		}
	}
}
