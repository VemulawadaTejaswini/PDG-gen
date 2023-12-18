import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		String A = "CODEFESTIVAL2016";
		int count = 0;
		for(int i=0;i<S.length();i++){
			String s = S.substring(i,i+1);
			String a = A.substring(i,i+1);
			if(!s.equals(a)){
				count++;
			}
		}
		System.out.println(count);

	}
}