import java.util.*;
import java.util.regex.*;

// (1+(6/2/2+50*3/2/3*6))*2+1=

class Main{
	static Pattern parens = Pattern.compile("(.*?)\\((.+)\\)(.*)");
	static Pattern addsub = Pattern.compile("(.*?)(\\d+)([+-])(\\d+)(.*)");
	static Pattern muldiv = Pattern.compile("(.*?)(\\d+)([*/])(\\d+)(.*)");
	static Pattern div = Pattern.compile("(.*?)(\\d+)\\/(\\d+)(.*)");

	static String process(String s){
		Matcher m=parens.matcher(s);
		while(m.find()){
			s=m.group(1)+process(m.group(2))+m.group(3);
			m=parens.matcher(s);
		}

		m=muldiv.matcher(s);
		while(m.find()){
			if(m.group(3).equals("*"))
				s=m.group(1)+(Integer.parseInt(m.group(2))*Integer.parseInt(m.group(4)))+m.group(5);
			else
				s=m.group(1)+(Integer.parseInt(m.group(2))/Integer.parseInt(m.group(4)))+m.group(5);
			m=muldiv.matcher(s);
		}

		m=addsub.matcher(s);
		while(m.find()){
			if(m.group(3).equals("+"))
				s=m.group(1)+(Integer.parseInt(m.group(2))+Integer.parseInt(m.group(4)))+m.group(5);
			else
				s=m.group(1)+(Integer.parseInt(m.group(2))-Integer.parseInt(m.group(4)))+m.group(5);
			m=addsub.matcher(s);
		}
		return s;
	}

	public static void main(String[]z){
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();for(;n>0;n--){
			String s=x.next();
			System.out.println(process(s.substring(0,s.length()-1)));
		}
	}
}