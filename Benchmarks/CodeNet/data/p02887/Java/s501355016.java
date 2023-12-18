import java.util.*;

public class Main{
	static int n;
	static String s;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		n = sc.nextInt();
		s = sc.next();
		System.out.println(calcSlimesNum());
	}
	
	static int calcSlimesNum(){
		int sameLength = 0, res = 1;
		char prevChar = 'p';
		
		for(int i = 0; i < n; ++i){
			if(sameLength == 0){
				prevChar = s.charAt(i);
				++sameLength;
			}else if(s.charAt(i) == prevChar){
				++sameLength;
			}else{
				prevChar = s.charAt(i);
				sameLength = 1;
				++res;
			}
		}
		return res;
	}
}