import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		
		while (true){
			String str = br.readLine();
			if ("0 0".equals(str)) break;
			list.add(str);
		}
		int swap = 0 ;
		for (int i = 0 ;i < list.size() ; i++){
			String[] stra = list.get(i).split(" ");
			int a = Integer.parseInt(stra[0]);
			int b = Integer.parseInt(stra[1]);
			if(b < a){
				swap = a ;
				a = b ;
				b = swap;
			}
			System.out.println(a + " " + b);
		}
	}

}