
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		Data []d = new Data [n];
		
		for(int i = 0 ; i < n ;i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			
			d[i] = new Data(a,b);
		}
		  Arrays.sort(d, new Comparator<Data>(){
	        	public int compare(Data d1, Data d2) {
	        		int temp = d2.getB() -d1.getB();
	        		if(temp == 0) {
	        			return d2.getA() - d1.getA();
	        		}
	        		return d2.getB() -d1.getB();
	        	}
	        });
		  
		  int day = 0;;
		  int ans = 0;
		
		  for(int i = 0 ; i < n ;i++) {
			  if(day == m) {
				  break;
			  }
			  if(day + d[i].getA() > m) {
				  continue;
			  }
			  ans += d[i].getB();
			  day++;
		  }
		  
		  System.out.println(ans);
	}
}

class Data{
	private int a;
	private int b;
	
	public Data(int a , int b){
		this.a = a;
		this.b = b;	
	}
	
	public int getA () {
		return a;
	}
	public int getB() {
		return b;
	}
	
}

