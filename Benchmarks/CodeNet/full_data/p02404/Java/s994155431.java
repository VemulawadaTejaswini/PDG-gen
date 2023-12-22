import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> h = new ArrayList<Integer>();
		ArrayList<Integer> w = new ArrayList<Integer>();
		ArrayList<String> strArray = new ArrayList<String>();
		String data;
		int count = 0;
		while(true) {
			strArray.add(br.readLine());
			data = strArray.get(strArray.size() - 1);
			if(data.equals("0 0")) {
				break;
			}
			count++;
		}
		
		for(int i = 0; i < strArray.size(); i++) {
			String s = strArray.get(i);
			String [] ary = s.split(" ", 0);
			h.add(Integer.parseInt(ary[0]));
			w.add(Integer.parseInt(ary[1]));
		}
		
		for(int k = 0; k < count; k++) {
			for(int i = 0; i < h.get(k); i++) {
				for(int j = 0; j < w.get(k); j++) {
					if(i >= 1 && i < h.get(k) - 1 && j >= 1 && j < w.get(k) - 1){
						System.out.print('.');
					}else {
						System.out.print('#');
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}