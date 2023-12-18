import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char[] c = N.toCharArray();
		int s = 1;
		int t = 1;
		for(int i=0;i<N.length();i++){
			if(s==1){
				if(c[i]=='L'){t*=0;}
			}
			if(s==-1){
				if(c[i]=='R'){t*=0;}
			}
			s *= -1;
		}
		System.out.println((t==1)?"Yes":"No");
		sc.close();
	}
	
}
