
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long c = in.nextLong();
		long k = in.nextLong();
		ArrayList<Long> t = new ArrayList<>();

		for(int i=0; i<n; i++){
			t.add(in.nextLong());
		}
		Collections.sort(t);

		long count = 0;
		int i = 0;
		long temp;


		while(t.size()>0){
			temp = t.get(0) + k;
			while(i<t.size() &&temp>t.get(i) && i<c){
				i++;
			}
			count++;
			for(int j=0; j<i; j++){
				t.remove(0);
			}
			i = 0;
		}
		System.out.println(count);
	}

}
