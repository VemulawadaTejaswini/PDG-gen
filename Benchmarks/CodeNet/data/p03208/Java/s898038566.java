import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<Integer> po = new ArrayList<Integer>();
		for(int i=0;i<N;i++){
		  po.add(sc.nextInt());
		}
		po.sort(null);
		int min = Integer.MAX_VALUE;
		for(int i=0;i<N - K+1;i++){
		  if(po.get(i+K-1) - po.get(i) < min){
		    min = po.get(i+K-1) - po.get(i);
		  }
		}
		System.out.println(min);
	}
}
