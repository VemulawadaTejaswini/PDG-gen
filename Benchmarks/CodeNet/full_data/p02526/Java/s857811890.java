import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> list = new TreeSet<Integer>();
		int count = 0;
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
		int q = sc.nextInt();
		for(int i=0;i<q;i++){
			if(list.contains(sc.nextInt()))count++;
		}
		System.out.println(count);
	}
}