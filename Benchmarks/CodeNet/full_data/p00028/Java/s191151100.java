import java.io.*;
import java.util.*;

class Main{
	
	public static void mode_v(ArrayList<Integer> list){
		int max =  0;
		ArrayList <Integer> inp = new ArrayList<Integer>();
		
		int[] num = new int[100];
		
		for(int i=0;i<num.length;i++){
			num[i] = 0;
			
		}
		
		for(int i=0;i<list.size();i++){
			int x = list.get(i);
			num[x-1]++;
		}
		for(int i=0;i<num.length;i++){
			if(max < num[i])
			max = num[i];
		}
		for(int i=0;i<num.length;i++){
			if(num[i] == max){
				System.out.println(i+1);
			}
		}
		
	}

	public static void main(String args[]) throws IOException{
		String str;
		ArrayList <Integer> inp = new ArrayList<Integer>();

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			
			str = scan.next();
			int x = Integer.valueOf(str).intValue();
			inp.add(x);
		}
		mode_v(inp);
	}
}