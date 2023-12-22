import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		List<Double> list = new ArrayList<Double>();

		List<Integer> cnt = new ArrayList<Integer>();

		for(int i = 0; i < 6; i++){
			cnt.add(0);
		}


		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		Integer num = Integer.parseInt(br.readLine());

		for(int i = 0; i < num; i++){

			list.add(Double.parseDouble(br.readLine()));

			if(list.get(i) < 165.0){
				cnt.set(0, cnt.get(0) + 1);
			} else if(165.0 <= list.get(i) && list.get(i) < 170.0){
				cnt.set(1, cnt.get(1) + 1);
			} else if(170.0 <= list.get(i) && list.get(i) < 175.0){
				cnt.set(2, cnt.get(2) + 1);
			} else if(175.0 <= list.get(i) && list.get(i) < 180.0){
				cnt.set(3, cnt.get(3) + 1);
			} else if(180.0 <= list.get(i) && list.get(i) < 185.0){
				cnt.set(4, cnt.get(4) + 1);
			} else{
				cnt.set(5, cnt.get(5) + 1);
			}
		}

		for(int i = 0; i < 6; i++){

			System.out.print(i + 1 + ":");

			for(int j = 0; j < cnt.get(i); j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}