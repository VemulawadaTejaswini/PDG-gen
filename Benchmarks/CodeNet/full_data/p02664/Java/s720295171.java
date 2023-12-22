import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String str = sc.next();
		String[] strArray = new String[str.length()];
		for (int i = 0; i < str.length(); i++) {
			String str2 = String.valueOf(str.charAt(i));
			strArray[i] = str2;
		}		
			for (int i = 0; i < strArray.length; i++) {
				if(strArray[i].equals("D")||strArray[i].equals("P")) {
					strArray[i] = strArray[i];
				}else if(strArray[i].equals("?")) {
					strArray[i] = "D";
				}
			}
		for (int i = 0; i < strArray.length; i++) { //表示
			System.out.print(strArray[i]);
		}
		System.out.println();
		sc.close();
	}
}
