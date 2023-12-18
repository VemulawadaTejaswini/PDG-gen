

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int x=0;
		for (int i = 0; i < str.length(); i++) {
			if(i%2==0){
				if(str.charAt(i)=='R' || (str.charAt(i)=='U' || str.charAt(i)=='D')) {
					continue;
				}
				else {
					x=-1;
					break;
				}
			}
			else {
				if(str.charAt(i)=='L'|| (str.charAt(i)=='U' || str.charAt(i)=='D')) {
					continue;
				}
				else {
					x=-1;
					break;
				}
			}
		}
		if(x==-1) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
	}

}
