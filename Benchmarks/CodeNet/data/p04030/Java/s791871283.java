import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char[] c = str.toCharArray();
		String str_ans = "";

		for(int i = 0; i < c.length; i++){
			if(c[i] == '0'){
				str_ans = str_ans + "0";
			}
			else if(c[i] == '1'){
				str_ans = str_ans + "1";
			}
			else if(c[i] == 'B'){
				if(!str_ans.equals("")){
					str_ans = str.substring(0, str_ans.length()-1);
				}
			}
		}
		System.out.println(str_ans);
	}
}
