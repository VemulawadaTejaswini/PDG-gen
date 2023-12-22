import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char c[] = new char[1000];
		int t[] = new int[200000], count = 0;
		String S;		
		for(int i = 0; ; i++){
			int length ;
			S = sc.next();
			if(S.equals("0"))
				break;
			count++;
			length = S.length();
			for(int j = 0; j < length; j++){
				c[j] = S.charAt(j);
				t[i] += Character.getNumericValue(c[j]);
			}
		}
		for(int i = 0; i < count; i++){
			System.out.println(t[i]);
		}
	}
}