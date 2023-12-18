
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		String O = sc.next();
		String E = sc.next();
		
		sc.close();

		for(int i=0; i<O.length()||i<E.length(); i++){
			System.out.print(O.charAt(i));
			System.out.print(E.charAt(i));
		}
	}
}