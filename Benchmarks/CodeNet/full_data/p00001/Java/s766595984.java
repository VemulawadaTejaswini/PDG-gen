import java.util.*; 
import static java.util.Arrays.*;
public class Main {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	static int array[] = new int[10];	
	static int i=0;
	
	public static void main(String[] args) {

		
		read();
		solve();
		
		
	}
	
	
	static boolean read(){

		while(sc.hasNextInt()){
			array[i] = sc.nextInt();
			i++;
		}
				
		return true;
	}
	
	
	static void solve(){
		sort(array);
		
		
		for(int i=array.length-1; i>=array.length-3; i--){
			System.out.println(array[i]);
		}
	}
	
	

}