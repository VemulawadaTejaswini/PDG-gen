import java.io.*;
import java.util.*;

class Main{
	
	public static void calendar(ArrayList<Integer> list){
		int y = 2004,m,d,wd;
		
		String[] arrWday = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		for(int i=0;i<list.size()/2;i++){
			m = list.get(i*2);
			d = list.get(i*2+1);
			if( m == 0 && d == 0)break;
			if(m == 1 || m == 2) {
				y--;
				m += 12;
			}
			wd = (y+y/4-y/y+100/400+(13*m+8)/5+d ) % 7;
			System.out.println(arrWday[wd]);
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
		calendar(inp);
	}
}