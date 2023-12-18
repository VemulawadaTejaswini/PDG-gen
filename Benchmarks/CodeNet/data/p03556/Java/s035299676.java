import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> heihos = new ArrayList<Integer>();
		int max	=0;
		for(int i=1;i<=N;i++) 
			if(i % Math.sqrt(i) ==0 ) heihos.add(i); 
		for(int i=0;i<heihos.size();i++) 
			if(max < heihos.get(i))	max=heihos.get(i);
		System.out.println(max);
	}
}
