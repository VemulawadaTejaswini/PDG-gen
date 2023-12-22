import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		for(int i = 0; i < 4; i++){
			left.add(0);
			right.add(0);
		}

		String str;
		while((str=br.readLine())!=null){
			String[] sp = str.split(" ");

			double l = Double.parseDouble(sp[0]);
			double r = Double.parseDouble(sp[1]);

			if(1.1 <= l){
				left.set(0, left.get(0) + 1);
			} else if(0.6 <= l && l < 1.1){
				left.set(1, left.get(1) + 1);
			} else if(0.2 <= l && l < 0.6){
				left.set(2, left.get(2) + 1);
			} else{
				left.set(3, left.get(3) + 1);
			}

			if(1.1 <= r){
				right.set(0, right.get(0) + 1);
			} else if(0.6 <= r && r < 1.1){
				right.set(1, right.get(1) + 1);
			} else if(0.2 <= r && r < 0.6){
				right.set(2, right.get(2) + 1);
			} else{
				right.set(3, right.get(3) + 1);
			}

		}

		for(int i = 0; i < 4; i++){
			System.out.println(left.get(i) + " " + right.get(i));
		}
	}

}