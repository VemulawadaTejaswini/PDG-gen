import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int nn = sc.nextInt();
		String ss = sc.next();
		String encryptedData="";
		
		for (int i = 0; i < ss.length(); i++) {
			encryptedData = encryptedData + String.valueOf((char)((ss.charAt(i) + nn-65)%26 + 65));
		}
		
		System.out.print(encryptedData);
	}
}