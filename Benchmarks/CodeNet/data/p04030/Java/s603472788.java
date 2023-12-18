import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] s = str.toCharArray();
		int i = 0;
		char[] edit = new char[str.length()];
		for(int j=0; j<str.length(); j++){
			if(s[j]!='B'){
				edit[i++] = s[j];
			}else{
				i--;
				if(i<0) i = 0;
			}
		}
		edit[i] = '\0';
		System.out.println(edit);
	}
}