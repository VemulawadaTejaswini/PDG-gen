import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int a = str.length();
		int m = 1,w = 0;
		for(int i = 0;i < a;i++){
			for(int k = m;k < a;k++){
				if(str.charAt(i) == str.charAt(k))w++;
			}
			m++;
		}
		if(w != 0)System.out.print("no");
		else System.out.print("yes");
	}

}