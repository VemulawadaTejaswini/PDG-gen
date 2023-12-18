import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M = sc.nextInt();
		List<Integer> list1= new ArrayList<>();
		int v = 0;
		for(int i =0; i<N; i++){
			int b = 0;
			for(int j =0; j< 3; j++){
				int a = sc.nextInt();
				a = (int)(Math.abs(a));
				b += a;
			}
			list1.add(b);
		}
		Collections.sort(list1);
		for(int i =1; i<=M; i++){
			v += list1.get(N-i);
		}
		System.out.println(v);
	}
}