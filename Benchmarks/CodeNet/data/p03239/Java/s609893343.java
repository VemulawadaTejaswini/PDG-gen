import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());

		int min= Integer.MAX_VALUE;
		for(int i=0; i<N; i++){
			int a=Integer.parseInt(sc.next());
			int b=Integer.parseInt(sc.next());
			if(b <= T){
				min = Math.min(min, a);
			}
		}
		if(min==Integer.MAX_VALUE){
			System.out.println("TLE");
		} else {
			System.out.println(min);
		}
	}
}
