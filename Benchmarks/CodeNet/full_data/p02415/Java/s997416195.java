import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		String str = new String(scan.next());
		
		char[] c = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++){
			c[i] = str.charAt(i);
			if(Character.isUpperCase(c[i])){
				c[i] = Character.toLowerCase(c[i]);
			}else{
				c[i] = Character.toUpperCase(c[i]);
			}
		}
		
		for(int j = 0; j < str.length(); j++){
			System.out.print(c[j]);
		}
	}
}