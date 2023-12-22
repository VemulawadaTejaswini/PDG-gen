import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer> x = new ArrayList<Integer>();
		int flag = 0, i = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(flag == 0) {
			x.add(Integer.parseInt(br.readLine()));
			if(x.get(i) == 0 || x.get(i) > 10000 || i > 10000) {
				x.remove(i);
				for(int j = 0; j < x.size(); j++) {
					System.out.println("case " + (j+1) + ": " + x.get(j));
				}
				flag = 1;
			}
			i++;
		}
	}
}