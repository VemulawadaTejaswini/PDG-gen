import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int tab[] = new int[n];
		for(int i =0; i < n ; i++) {
			tab[i] = sc.nextInt();
		}
		ArrayList<Integer> set = new ArrayList<Integer>();
		int cycle =1;
		int curr =1;
		while(!set.contains(curr)) {
			set.add(curr);
			curr=tab[curr-1];
		}
		int currAux = curr;
		curr=tab[curr-1];
		while(currAux!=curr) {
			cycle++;
			curr=tab[curr-1];
		}
		System.out.println(set.get((int) (k%cycle)));
	}

}
