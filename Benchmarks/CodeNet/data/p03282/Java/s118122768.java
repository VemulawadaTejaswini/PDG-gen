import java.util.*;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		
		String v=s.next();
		int n=s.nextInt();
		for(int i=0,e=Math.min(v.length(),n);i<e;++i) {
			if(v.charAt(i)!='1') {
				System.out.println(v.charAt(i));
				return;
			}
		}
		System.out.println('1');
	}
}
