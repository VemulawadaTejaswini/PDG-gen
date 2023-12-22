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
		StringBuilder sb = new StringBuilder();
		int n = 0;
		
		sb.append(as.next());
		n = Integer.parseInt(as.next());
		
		for(int i=0;i<n;i++){
			
			if(sb.indexOf(as.next()) != -1){
				
				System.out.println("1");
				
			}
			else{
				
				System.out.println("0");
				
			}
			
		}
		

	}

}