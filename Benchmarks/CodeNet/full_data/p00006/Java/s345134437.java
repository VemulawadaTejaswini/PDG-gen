import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str =scan.nextLine();
		char[] s = new char[20];
		char[] t = new char[20];
		s=str.toCharArray();
		for(int i=0;i<s.length;i++){
			t[t.length-1-i]=s[i];
		}
		str=String.valueOf(t);
		System.out.println(str);
	}

}