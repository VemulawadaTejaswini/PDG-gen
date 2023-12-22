/**
 * 
 */

/**
 * @author Chisom
 *
 */
public class startTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startTest test = new startTest();
		test.multiply(10);
	}
	
	public void multiply(int limit) {
		int limit2 = limit;
		for (int i = 1; i <= limit; i++) {
			for (int j = 1; j <= limit2; j++) {
				System.out.println(String.valueOf(i) + "x" + String.valueOf(j) + "=" + String.valueOf(i*j));
			}
		}
	}

}