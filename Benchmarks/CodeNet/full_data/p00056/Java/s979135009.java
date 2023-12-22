import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n,count;
		boolean is;
		
		try{
		while((n = Integer.parseInt(reader.readLine())) != 0){

			count = 0;
			
			for(int i = 2; i < n; i++){
				is = true;
				
				for(int j = 2; j <= Math.sqrt(i); j++)
					if(i % j == 0){
						is = false;
						break;
					}
				
				if(is)list.add(i);
			}
			for(int i = 0; i < list.size(); i++)
				for(int j = i; j < list.size(); j++)
					if(list.get(i) + list.get(j) == n)count++;
			
			System.out.println(count);
			list.clear();
		}
		reader.close();
		}catch(IOException e){
		}
		}
}