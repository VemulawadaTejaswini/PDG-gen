import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String strlist[] = str.split(" ");
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 0; i < N; i++){
			numList.add(Integer.parseInt(strlist[i]));
		}

		int counter = 0;
		while(true){
			boolean flg = false;
			for(int i = 0; i < N; i++){
				if(numList.get(i) % 2 != 0){
					flg = true;
				}
			}
			if(flg){
				break;
			}
			for(int i = 0; i < N; i++){
				numList.set(i, numList.get(i)/2);
			}
			counter++;
		}
		System.out.println(counter);
	}
}