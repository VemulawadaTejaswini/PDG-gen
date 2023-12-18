
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		String O = sc.next();
		String E = sc.next();
		int i = 0;
		
		sc.close();

		for(i=0; i<E.length(); i++){
			if(E.length()==O.length()){
				System.out.print(O.charAt(i));
				System.out.print(E.charAt(i));
			}
		}
		
		if(E.length()!=O.length()){
				System.out.print(O.charAt(i+1));
			}
	}
}