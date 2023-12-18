import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public static void main(String[] args) {
	int N=sc.nextInt();
	String S =sc.next();
	int Q=sc.nextInt();
	int type,a,b,cnt=0;
	char v;
	StringBuilder sb = new StringBuilder(S);
	for(int i=0;i<Q;i++) {
		type=sc.nextInt();
		a=sc.nextInt();
		v= sc.next().charAt(0);
		if(type==1) {
			if (sb.charAt(a-1)==v) {
				continue;
			}
			else {
				sb.setCharAt(a-1,v);
			}
		}else{
			b=sc.nextInt();
				for(int f=0;f<=25;f++) {
					if(sb.indexOf(eikomoji[f], a-1)<=b-1&&sb.indexOf(eikomoji[f], a-1)!=-1) {
						cnt++;
					}
				
				
			}
			System.out.println(cnt);
			cnt=0;
			}
	}
	
	}
}