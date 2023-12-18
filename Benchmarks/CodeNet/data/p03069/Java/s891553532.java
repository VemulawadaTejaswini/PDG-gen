//package at_coder;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		StrMng sm = new StrMng(new StringBuilder(sc.next()));
		sc.close();
		
		int boundary = sm.sb.indexOf("#");
		if(boundary==-1) {
			System.out.println(0);
			return;
		}
		int min = sm.cntChar('#',0,boundary) + sm.cntChar('.',boundary,num);
		boundary = sm.sb.indexOf(".#",boundary)+1;
		while(boundary>0) {
			int score = sm.cntChar('#',0,boundary) + sm.cntChar('.',boundary,num);
			if(score < min)
				min = score;
			boundary = sm.sb.indexOf(".#",boundary)+1;
		}
		System.out.println(min);
	}
}

class StrMng{
	StringBuilder sb;
	StrMng(StringBuilder sb){
		this.sb = sb;
	}
	
	int cntChar(char ch,int start,int end) {
		int count = 0;
		for(int i=start;i<end;i++) 
			if(sb.charAt(i) == ch)
				count++;
		return count;
	}
}