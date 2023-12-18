import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		
		String S = scan.next();
		
		char[] s = new char[S.length()];
		s =S.toCharArray();
		
		
		
		
		String che = "abcdefghijklmnopqrstuvwxyz";//26文字
		char [] check =new char[26];
		check = che.toCharArray();
		
		char answer = ' ';
		int forcount = 0;
		
		
		for(int i = 0;i<26;i++){//英語の文字分数える
			int count = 0;
			
			for(int k = 0;k<S.length();k++){
				if(check[i]==s[k]){
					count = 1;
				}
				
			}
			
			
			if(count==0){
				answer = check[i];
				break;
			}
			
			forcount+=1;//これが２６になる時それはｚの文字の処理が終わって全ての文字が存在したということ
			
			
		}
		
		
		if(forcount==26){
			System.out.println("NONE");
			
		}else{
			System.out.println(answer);
		}
		
		
		
		
		
	}

}
