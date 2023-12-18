import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int N = Integer.parseInt(S);
		S = br.readLine();

		List<Integer> westList = new ArrayList<Integer>();
		List<Integer> eastList = new ArrayList<Integer>();

		int west = 0;
		int east = 0;

		for(int i = 0;i<S.length();i++){
			if(S.charAt(i) == 'W')west++;
			else east++;

			westList.add(west);
			eastList.add(east);
		}

		int change = eastList.get(eastList.size()-1) - eastList.get(0);
		change = Math.min(change, westList.get(westList.size()-1) - westList.get(0));

		for(int i = 1;i<S.length()-1;i++){
			int nowE = westList.get(i) ;
			int nowW = eastList.get(eastList.size()-1) - eastList.get(i);

			change = Math.min(change, nowE+nowW);
		}

		System.out.println(change);


	}
}