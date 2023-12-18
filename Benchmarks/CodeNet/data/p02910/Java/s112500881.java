import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans = "Yes";
		for(int i=1;i<=S.length();i++){
			if((i%2)==1){
				if((S.charAt(i-1)=='R')||(S.charAt(i-1)=='U') ||(S.charAt(i-1)=='D')){
				}
				else{
				ans="No";
				}
			}
			else{
				if((S.charAt(i-1)=='L')||(S.charAt(i-1)=='U') ||(S.charAt(i-1)=='D')){
				}
				else{
				ans="No";
				}
			}
		}
		System.out.println(ans);
    }
}