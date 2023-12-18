import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long ans=((s.length())*(s.length()-1))/2 + 1;
		for(int i = 0; i<s.length()-1; i++){
				String a=String.valueOf(s.charAt(i));
				String b=String.valueOf(s.charAt(i+1));
				int c1=i;
				int c2=i+1;
				if(a.equals(b)){
					ans--;
				}
				while(a.equals(b) && c1-1>=0 && c2+1<=s.length()-1){
					ans--;
					c1--;
					c2++;
					a+=String.valueOf(s.charAt(c1));
					b+=String.valueOf(s.charAt(c2));
				}
		}
		for(int i = 0; i<s.length()-2; i++){
				String a=String.valueOf(s.charAt(i));
				String b=String.valueOf(s.charAt(i+2));
				int c1=i;
				int c2=i+2;
				if(a.equals(b)){
					ans--;
				}
				while(a.equals(b) && c1-1>=0 && c2+1<=s.length()-1){
					ans--;
					c1--;
					c2++;
					a+=String.valueOf(s.charAt(c1));
					b+=String.valueOf(s.charAt(c2));
				}
		}
		System.out.println(ans);
	}
}