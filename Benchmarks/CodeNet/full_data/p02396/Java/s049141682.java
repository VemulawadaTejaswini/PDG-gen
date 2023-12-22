import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args)throws IOException {
		
		int num = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();

		do {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		num = Integer.parseInt(str);
		
		list.add(num);
		
		}while(num != 0);
		
		for(int i=0 ; i<list.size()-1; i++) {
			System.out.println("Case"  +" " + (i+1)  +": " + list.get(i));
		}
		
	}
	
}