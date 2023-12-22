import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
//import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, NumberFormatException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<String>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			String[] str = br.readLine().split(" ");
			
			switch (str[0]){
			case "insert":
				list.add(0, str[1]);//LinkedList{O(1)}, ArrayList{O(n)}
				break;
				
			case "delete":
				if(list.indexOf(str[1]) >= 0){
					list.remove(list.indexOf(str[1]));//O(n^2) ????????????20?????\???????????§??????
				}
				break;
				
			case "deleteFirst":
				list.remove(0);//LinkedList{O(1)}, ArrayList{O(n)}
				break;
				
			case "deleteLast":
				list.remove(list.size() - 1);//LinkedList{O(n^2)}, ArrayList{O(1)}
				break;
			}
		}
		
		for(Iterator<String> it = list.iterator(); it.hasNext();){//O(n)
			System.out.print(it.next());
					
			if(it.hasNext()){
				System.out.print(" ");
			} else {
				System.out.print("\n");
			}
		}
		
		/*for(int i = 0; i < list.size(); i++){//O(n^2)
			System.out.print(list.get(i));
			
			if(i + 1 == list.size()){
				System.out.print("\n");
			} else {
				System.out.print(" ");
			}
		}*/
	}
}