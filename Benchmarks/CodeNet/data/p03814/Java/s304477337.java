import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int aplace = 0;
		int zplace = 0;
		for(int i=0; i<s.length()-1; i++){
			if(s.charAt(i)=='A'){
				aplace = i;
				break;
			}
		}
		for(int i=s.length()-1; i>0; i--){
			if(s.charAt(i)=='Z'){
				zplace = i;
				break;
			}
		}
		System.out.println(zplace-aplace+1);
	}
}