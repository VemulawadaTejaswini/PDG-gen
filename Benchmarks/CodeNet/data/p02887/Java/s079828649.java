import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),c=0;
		String s = sc.next();	
		n++;
		c++;
		for(int i = 1;i<s.length();i++){
			if(i-1==s.length()-1){
				break;
			}
			else if(s.charAt(i-1)!=s.charAt(i))
				c++;
		}
		System.out.println(c);
	}

}