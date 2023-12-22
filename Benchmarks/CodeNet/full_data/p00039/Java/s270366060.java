//Volume0-0039
import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		//declare
		char[] c;
		int    p,next,sum;
		
		//input
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			c = sc.nextLine().toCharArray();
			
			//initialize
			p=0;next=0;sum=0;
			
			//calculate
			for(int i=0;i<c.length;i++){
				p = chg(c[i]);
				if(i+1<c.length){next = chg(c[i+1]);}
				if(p < next){
					sum += (next - p);
					i++;
				} else {
					sum += p;
				}
			}
			
			//output
			System.out.println(sum);
		}
	}

	//translate
	private static int chg(char c){
		int ret = 0;
		switch (c) {
			case 'I':{ret =    1; break;}
			case 'V':{ret =    5; break;}
			case 'X':{ret =   10; break;}
			case 'L':{ret =   50; break;}
			case 'C':{ret =  100; break;}
			case 'D':{ret =  500; break;}
			case 'M':{ret = 1000;      ;}
		}
		return ret;
	}
}