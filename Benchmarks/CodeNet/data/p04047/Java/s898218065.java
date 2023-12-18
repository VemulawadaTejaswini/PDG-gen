import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(br.readLine());
		String L = br.readLine();
		String[] Llist = L.split(" ");

		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 0; i < N*2; i++){
			numList.add(Integer.parseInt(Llist[i]));
		}
		Collections.sort(numList, Collections.reverseOrder());

		// 降順に並べて上から2つずつ取る
		// 低い方の値を採用して、全部足す
		Integer output = 0;
		for(int i = 0; i < N*2; i++){
			if(i % 2 == 0){
				continue;
			}else{
				output += numList.get(i);
			}
		}
		System.out.println(output);
	}
}