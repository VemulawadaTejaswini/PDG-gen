import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
	
	public static void main(String arg[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String wdn = br.readLine();
		int N = Integer.parseInt(wdn);
		List<Integer> list = new ArrayList<Integer>();
  /*Statement*/
		int num = 0;
		int cnt = 0;

		
		for(int i=0; i<N; i++){
			wdn = br.readLine();
			String[] sta = wdn.split(" ");
			
			if(sta[0].equals("insert")){
				num = Integer.parseInt(sta[1]);
				list.add(0, num);
			}else if(sta[0].equals("delete")){
				num = Integer.parseInt(sta[1]);
				if(list.indexOf(num)>=0){
					list.remove(num);
				}
			}else if(sta[0].equals("deleteFirst")){
				list.remove(0);
			}else if(sta[0].equals("deleteLast")){
				list.remove(list.size()-1);
			}
		}
		for (int i=0; i<list.size()-1; i++){
	        System.out.print(list.get(i) + " ");
		}
		System.out.println(list.get(list.size()-1));
	}
}

