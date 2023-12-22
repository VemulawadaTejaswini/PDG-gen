//Volume0-0058
import java.util.Scanner;

class P {
	public double x;
	public double y;
	P(double x,double y){
		this.x = x;
		this.y = y;
	}
}

public class Main {

	public static void main(String[] args){

		//declare
		P        A,B,C,D;
		String[] s;
		String   result;

		//input
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	s = sc.nextLine().split("\\s");
        	A = new P(Double.parseDouble(s[0]),Double.parseDouble(s[1]));
        	B = new P(Double.parseDouble(s[2]),Double.parseDouble(s[3]));
        	C = new P(Double.parseDouble(s[4]),Double.parseDouble(s[5]));
        	D = new P(Double.parseDouble(s[6]),Double.parseDouble(s[7]));

        	//calculate
        	if   (is_orthogonal(A,B,C,D)){result = "YES";}
        	else                         {result = "NO" ;}

        	//output
        	System.out.println(result);
        }
	}

	private static boolean is_orthogonal(P a,P b,P c,P d){
		P e = new P(a.x - b.x,a.y - b.y);
		P f = new P(c.x - d.x,c.y - d.y);
		if(dot(e,f) == 0){return true;}
		return false;
	}

	private static double dot(P a,P b){
		return a.x * b.x + a.y * b.y;
	}
}