import java.io.*;
import java.util.*;
class Lot3h{
	public static void main(String[] args)throws IOException{
	
		
		List<Integer> list=new ArrayList<Integer>();
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<10; i++){
			
			String str = buf.readLine();
			int num = Integer.parseInt(str);
			list.add(num);
			
		}
		
		
		Collections.sort(list);
		
		System.out.println(list.get(9));
		System.out.println(list.get(8));
		System.out.println(list.get(7));
	
	}
}