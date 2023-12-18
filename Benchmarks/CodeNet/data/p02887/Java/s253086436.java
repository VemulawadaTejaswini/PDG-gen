import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next(),b ="";
		b += s.charAt(0);
		for(int i = 0;i<s.length();i++){
			
			if(i==s.length()-1){
				break;
			}
			else if(s.charAt(i)!=s.charAt(i+1))
				b+=s.charAt(i+1);
		}
		System.out.println(b.length());
	}

}
