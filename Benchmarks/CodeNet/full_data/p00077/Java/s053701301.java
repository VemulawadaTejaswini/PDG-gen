import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String result = "" , str = sc.nextLine();
			for(int i=0; i<str.length(); i++){
				if ( str.charAt(i) == '@' ) {
					for(int j=0; j<Integer.parseInt(""+str.charAt(i+1)); j++)
						result += Character.toString(str.charAt(i+2));
					i+=2;
				} else
					result += str.charAt(i);
			}
			System.out.println(result);
		}
	}
}