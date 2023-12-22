import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Integer> list = new ArrayDeque<Integer>();
		int count = 0;
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			list.push(sc.nextInt());
		}
		int q = sc.nextInt();
		for(int i=0;i<q;i++){
			if(list.contains(sc.nextInt())==true)count++;
		}
		System.out.println(count);
	}
}