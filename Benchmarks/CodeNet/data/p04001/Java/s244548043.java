import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args){
		try(Scanner scan = new Scanner(System.in)){
			String S = scan.nextLine();
			
			int max = (int) Math.pow(2,S.length()-1);
			long ans = 0;
			
			for(int bit = 0; bit<max; bit++){
				int left = 0;
				for(int i = 0; i < S.length()-1; i++){
					if( ((bit >> i) & 1) > 0){
						ans += Integer.valueOf(S.substring(left, i+1));
						left = i+1;
					}
				}
				ans+=Integer.valueOf(S.substring(left, S.length()));
			}
			
			System.out.println(ans);
		}
	}
}
