
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	static Set<String> s=new TreeSet<String>();
	
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		Scanner sc=new Scanner(System.in);
		int n;
		String str;
		n=sc.nextInt();
		
		while(n--!=0){
			s.clear();
			str=sc.next();
			cut(str);
			
			//System.out.println(s);
			System.out.println(s.size());
		}
	}
	
	static void cut(String str){
		String str1,str2;
		int i;
		for(i=1;i<str.length();i++){
			str1=str.substring(0,i);
			str2=str.substring(i);
			comb(str1,str2);
		}
	}
	static void comb(String str1,String str2){
		String a=str1,b=str2;
		//a=a.concat(b);
		s.add(a.concat(b));
		s.add(b.concat(a));
		String ra  , rb;
		StringBuilder x=new StringBuilder(str1),y=new StringBuilder(str2);
		ra=x.reverse().toString();
		rb=y.reverse().toString();

		s.add(ra.concat(b));
		s.add(b.concat(ra));
		
		s.add(a.concat(rb));
		s.add(rb.concat(a));
		
		s.add(ra.concat(rb));
		s.add(rb.concat(ra));
		
	}
}