import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		int a = 0;
		int n = 3; //?????§????????????????????°
		int i = 0;
		ArrayList<Integer> parse = new ArrayList<Integer>(); // int??????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(i != n){
			a = Integer.parseInt(br.readLine());
			if(a == 0){
				break;
			}
			parse.add(a);
			++i;
		}

		for(int j = 0; j < parse.size(); ++j){
		System.out.println("Case " + (j+1) + ": " + parse.get(j));
		}
	}
}