import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String	O = sc.next(),E=sc.next();

		if(O.length()>E.length()) {
			System.out.println("GREATER");
		}else if(E.length()>O.length()){
			System.out.println("LESS");
		}else {
			for(int i=0;i<E.length();i++) {
				if(O.charAt(i)>E.charAt(i)) {
					System.out.println("GREATER");
					break;
				}else if(E.charAt(i)>O.charAt(i)) {
					System.out.println("LESS");
					break;
				}else if(i==O.length()-1){
					System.out.println("EQUAL");
				}
			}
		}
	}

	public static int sample() {
		return 1;
	}

}
