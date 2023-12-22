import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		boolean f = false;
		String ans = "";
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(!f && c=='A'){
				f = true;
			}else if(f && c=='Z'){
				f = false;
				ans += "AZ";
			}
		}
		
		if(ans.equals("")){
			ans = "-1";
		}
		System.out.println(ans);
	}
	
}