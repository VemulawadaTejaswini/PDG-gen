import java.util.*;

class GL {
	public long GCD,LCM;

	public GL(long a,long b){
		long g = gcd(a,b);
		this.GCD = g;
		this.LCM = a * b / g;
	}
	private long gcd(long a,long b){
		while( a != b ){
			if( a < b ){
				b -= a;
			} else if( a > b ){
				a -= b;
			}
		}
		return a;
	}
}

public class Main {
	public static void main(String[] args) {

		ArrayList<GL> ar = new ArrayList<GL>();

		//input
		Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
		String[] s;
         while(sc.hasNext()){
             s = sc.next().split("\\s");
             ar.add(new GL(Long.parseLong(s[0]),Long.parseLong(s[1])));
         }
		
         //output
         for(GL g:ar){System.out.println(g.GCD + " " + g.LCM);}
	}
}