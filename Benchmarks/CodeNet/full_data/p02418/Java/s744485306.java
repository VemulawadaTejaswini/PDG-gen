import java.util.Scanner;

public class Main {


		public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int flg = 0;
		int len_cnt = 0;
		
		String s = scan.nextLine();//??????????????????
		String p = scan.nextLine();//??????????????????
		
		String s2 = s + s;//s???2?????£????????????
		
		int s2_len = s2.length();
		int p_len = p.length();
		
		for(int s2_cnt = 0; s2_cnt < s2_len - p_len; s2_cnt++){
			
			int ans_cnt = 0;
				
			for(int p_cnt = 0; p_cnt < p_len; p_cnt++){
				if(p.charAt(len_cnt) == s2.charAt(s2_cnt + p_cnt)){
					ans_cnt++;
					if(ans_cnt == 5){
						flg = 1;
						break;
					}
				}else{
					len_cnt = 0;
					ans_cnt = 0;
				}
				System.out.println(ans_cnt);
			}			
		}
		if(flg == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
		//????§????
		scan.close();
	}
}