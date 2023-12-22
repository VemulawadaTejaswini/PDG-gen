public class Main {
	public static void main (String [] args) {
		double S = 1000;
		double h = S/60/60;
		double m = S/60;
		double s = S ;
		if (s<60){
		System.out.println(h+":"+m+":"+s);
		}else {
			s = 59;
			System.out.println(h+":"+m+":"+s);	
		}
	}
	
	
}
