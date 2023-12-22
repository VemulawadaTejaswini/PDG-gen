
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		label:while(true){
			int A = 0;
			int B = 0;
			for(int cases = 0;cases<3;cases++){
				A = 0;
				B = 0;
				String str= cin.next();
				if(str.equals("0")){
					break label;
				}
				for(int i = 1;i<str.length();i++){
					if(str.charAt(i)=='A'){
						A++;
					}
					else{
						B++;
					}
				}
				if(A>B){
					A++;
				}
				else{
					B++;
				}
				System.out.println(A +" " + B);
			}
		}
	}

}