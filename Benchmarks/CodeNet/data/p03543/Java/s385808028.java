

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char tmp1=0, tmp2=0;
		int c1=0, c2=0;
		for(int i = 0;i < 4;++i){
			if(tmp1 == 0){
				tmp1 = s.charAt(i);
				c1 = 1;
			}else if(tmp2 == 0 && tmp1 != s.charAt(i)){
				tmp2 = s.charAt(i);
				c2 = 1;
			}else{
				if(tmp1 == s.charAt(i)){
					++c1;
				}
				if(tmp2 == s.charAt(i)) ++c2;
			}
		}
		if(c1 >= 3 || c2 >= 3){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
