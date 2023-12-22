import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Long> list = new ArrayList<>(); 
		br.readLine();
		String str;
		while((str = br.readLine()) != null){
			list.add(Long.valueOf(str));
		}
		int cursor = list.size() - 1;
		long max = 0;
		long maxProfit = Long.MIN_VALUE;
		while(cursor >= 0){
			if(max - list.get(cursor) > maxProfit){
				maxProfit = max - list.get(cursor);
			}
			if(list.get(cursor) > max){
				max = list.get(cursor);
			}
			cursor--;
		}
		System.out.println(maxProfit);
	}
}