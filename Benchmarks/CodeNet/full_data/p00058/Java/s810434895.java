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

		P        A,B,C,D;
		String[] s;
		String   result;

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	s = sc.nextLine().split("\\s");
        	A = new P(Double.parseDouble(s[0]),Double.parseDouble(s[1]));
        	B = new P(Double.parseDouble(s[2]),Double.parseDouble(s[3]));
        	C = new P(Double.parseDouble(s[4]),Double.parseDouble(s[5]));
        	D = new P(Double.parseDouble(s[6]),Double.parseDouble(s[7]));
        	if   (isOrth(A,B,C,D)){result = "YES";}
        	else                  {result = "NO" ;}
        	System.out.println(result);
        }
	}

	private static boolean isOrth(P A,P B,P C,P D){
    	if ((isPerp(A,B) && isHorizon(C,D)) ||
    		(isPerp(C,D) && isHorizon(A,B))){
    		return true;
    	}
    	if (slope(A,B) * slope(C,D) == -1.0){
    		return true;
   		}
    	return false;
	}

	private static boolean isPerp(P a,P b){
		if(a.x == b.x){return true;}
		return false;
	}
	private static boolean isHorizon(P a,P b){
		if(a.y == b.y){return true;}
		return false;
	}

	private static double slope(P a,P b){
		return (b.y - a.y) / (b.x - a.x);
	}
}