import java.util.Scanner;

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
		int k = 0;
		int w = 0;
		int keisan = 0;
		
		n = Integer.parseInt(as.next());
		k = Integer.parseInt(as.next());
		
		for(int i=0;i<n;i++){
			
			keisan += Integer.parseInt(as.next());
			
		}
		
		keisan = keisan/k;
		
		if(k != 1){
			
			keisan++;
			
		}
		
		sb.append(String.valueOf(keisan));
		
		System.out.println(sb);
		
		

	}

}