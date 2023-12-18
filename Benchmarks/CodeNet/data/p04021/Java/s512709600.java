import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		ArrayList<CustomNumber> arr = new ArrayList<>();
		
		for(int i = 0 ; i < N ; i++){
			int tmp = Integer.parseInt(bf.readLine());
			arr.add(new CustomNumber(tmp, i));
		}
		
		Collections.sort(arr);
		
		int ctr = 0;
		
		for(int i = 0 ; i < N ; i++){
			CustomNumber curr = arr.get(i);
			
			if(curr.pos % 2 == 0 && i%2 == 1) ctr++;
			else if(curr.pos % 2 == 1 && i%2 == 0) ctr++;
		}
		
		if(ctr !=0) System.out.println(ctr/2);
		else System.out.println(0);
	}
}

class CustomNumber implements Comparable<CustomNumber>{
	int value;
	int pos;
	
	public CustomNumber(int val, int po){
		value = val;
		pos = po;
	}
	
	@Override
	public int compareTo(CustomNumber sec) {
		return value - sec.value;
	}
}