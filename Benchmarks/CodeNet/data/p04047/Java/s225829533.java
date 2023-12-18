import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		ArrayList<Integer> l = new ArrayList<Integer>();
		while(sc.hasNext()){
			l.add(sc.nextInt());
		}
		Collections.sort(l);
		for(int i=0; i<l.size(); i+=2){
			ans += l.get(i);
		}
		System.out.println(ans);
	}

}