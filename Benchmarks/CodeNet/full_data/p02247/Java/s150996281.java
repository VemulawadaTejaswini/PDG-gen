import java.util.Scanner;

/**
 * 
 */

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		String T ="";
		String P ="";
		
		int point = 0;
		int hyouj = 0;
		
		T = as.next();
		P = as.next();
		
		point = T.indexOf(P);
		if(point == 0){
			
			System.out.println(String.valueOf(point));
			T = T.substring(point+1);
			hyouj++;
			
		}
		while(point != -1){
			
			point = T.indexOf(P);
			if(point == 0)
				hyouj++;
			
			hyouj += point;
			if(point != -1){
				
				System.out.println(String.valueOf(hyouj));
				T = T.substring(point+1);
				
			}
		}

	}

}