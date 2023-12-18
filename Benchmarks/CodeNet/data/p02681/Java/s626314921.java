import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String a = sca.next();
		String b = sca.next();
		if(a.charAt(0)!=b.charAt(0)) {
			int a1=0;
			for(int i=0;i<a.length();i++) {
				if(a.charAt(i)!=b.charAt(i+1)) {
					a1=1;
				}
				if(a1==1)break;
			}
			
			if(a1==1) {
				System.out.println("No");
			}else {
				if(b.charAt(0)<='z'&&b.charAt(0)>='a') {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}
			
		}else {
			int a1=0;
			for(int i=0;i<a.length();i++) {
				if(a.charAt(i)!=b.charAt(i)) {
					a1=1;
				}
				if(a1==1)break;
			}
			
			if(a1==1) {
				System.out.println("No");
			}else {
				if(b.charAt(b.length()-1)<='z'&&b.charAt(b.length()-1)>='a') {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}
			
			
		}
	}
}