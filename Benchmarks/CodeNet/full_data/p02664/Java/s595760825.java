import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String T = sc.next();
		for(int i = 0;i < T.length();i++){
			if(T.charAt(i) == '?'){
				T = T.substring(0,i) + "D" + T.substring(i+1,T.length());
			}
		}
		System.out.println(T);
	}
}