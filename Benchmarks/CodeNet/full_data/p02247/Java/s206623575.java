import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
class Main {
  	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int[] x = new int[4];
		LinkedList<Integer> a = new LinkedList<Integer>();
		
		x[0] = str1.indexOf(str2);
		a.add(str1.indexOf(str2));
		
		for(int i = 1; i < x.length; i++){
			a.add(str1.indexOf(str2, a.get(i - 1) + 1));
		}
		
		for(int i = 0; i < a.size(); i++){
			System.out.println(a.get(i));
		}
	}
}