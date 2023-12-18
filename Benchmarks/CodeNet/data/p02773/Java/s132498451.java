import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		ArrayList<String> data = new ArrayList<String>();
		
		ArrayList<Integer> value = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			String vote = input.next();
			if(!data.contains(vote)) {
				data.add(vote);
				value.add(0);
			}else {
				int index = data.indexOf(vote);
				int total = value.get(index) + 1;
				value.set(index, total);
			}
		}
		
		int max = Collections.max(value);
		ArrayList<String> fin = new ArrayList<String>();
		for(int i=0;i<value.size();i++) {
			if(value.get(i) == max) {
				fin.add(data.get(i));
			}
		}
		
		Collections.sort(fin);
		
		for(String f: fin) {
			System.out.println(f);
		}
	}

}
