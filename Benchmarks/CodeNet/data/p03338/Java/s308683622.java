import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		int result = 0;
		int fin = 0;
		for(int i = 0;i<S.length();i++){
			result = 0;
			List<Character> left = new ArrayList<Character>();
			List<Character> right = new ArrayList<Character>();
			for (int l = 0;l<i;l++){
				char now = S.charAt(l);
				if(!left.contains(now))left.add(now);
			}
			for (int r = i;r<S.length();r++){
				char now = S.charAt(r);
				if(!right.contains(now))right.add(now);
			}

			for(int p = 0;p<left.size();p++){
				char now = left.get(p);
				if(right.contains(now))result++;
			}
			fin = Math.max(fin, result);

		}
		System.out.println(fin);
	}


}
