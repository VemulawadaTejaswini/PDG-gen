import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static double circle(int r,double p){
		double cir = 2*p*r;
		return cir;
	}
	public static double area(int r, double p){
		double area = p*r*r;
		return area;
	}
	public static boolean exception(int r){
		boolean result;
		if(0 < r && r < 10000){
			result = true;
			return result;
		}
		else{
			result = false;
			return result;
		}
	}
	public static void main(String[] args) throws IOException{
		/**
		 * ?????°?????£?¨?
		 */
		int r = 0;
		double p = 3.141592653589;
		String str;
		/**
		 * ???????????£?¨?
		 */
		ArrayList<String> st = new ArrayList<String>();
		ArrayList<Integer> parse = new ArrayList<Integer>();
		/**
		 * ?????????????????\?????¨int??????
		 */
		Scanner scan = new Scanner(System.in);
		st.add(scan.next());
		r = Integer.parseInt(st.get(0));
		parse.add(r);
		/**
		 * ????????¨????????????
		 */
		if(exception(r) == true){
		System.out.printf("%8.6f ",circle(r,p));
		System.out.printf("%8.6f\n",area(r,p));
		}
		else if(exception(r) == false){
			System.out.println("??\???????????????1~10000??§???.???????????????.");
		}
	}

}