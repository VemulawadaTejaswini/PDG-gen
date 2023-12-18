

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		char[] stone = sc.next().toCharArray();
		
		int black = 0;
		int white = 0;
		int tmp_black = 0;
		int tmp_white = 0;
		int last_black = 0;
		boolean flag = false;
		for(char c : stone){
			if(c=='#'){
				flag=true;
				tmp_black++;
				tmp_white = 0;
			}
			if(c=='.' && flag){
				tmp_white++;
				white++;
				black += tmp_black;
				last_black = tmp_black;
				tmp_black = 0;
			}
		}
		int ans_=black -last_black + tmp_white;
		int ans = Math.min(Math.min(black, white),ans_);
		System.out.println(ans);
		
		sc.close();
	}
	
}
