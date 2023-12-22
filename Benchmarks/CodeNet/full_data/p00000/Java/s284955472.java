/**
 * 
 */

/**
 * @author Chisom
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main.multiply(9);
	}
	
	public static void multiply(int limit) {
		int limit2 = limit;
		for (int i = 1; i <= limit; i++) {
			for (int j = 1; j <= limit2; j++) {
				System.out.println(String.valueOf(i) + "x" + String.valueOf(j) + "=" + String.valueOf(i*j));
			}
		}
	}
}