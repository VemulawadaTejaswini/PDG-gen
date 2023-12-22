import java.util.*;
import java.util.regex.*;
import static java.lang.System.out;

// String
public class Main {
	public static void main(String[] args) {
		new Main().AOJ0084();
	}
	Scanner sc = new Scanner(System.in);
	
	void AOJ0084(){	// Search Engine
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext()){
			String s=sc.next().replaceAll(",", "").replaceAll("\\.", "").replaceAll(" ", "");
			// out.println(s);
			if(s.length()<=2 || s.length()>=7)	continue;
			sb.append(s+" ");
		}
		out.println(sb.deleteCharAt(sb.length()-1));
	}
	
	void AOJ0077(){	// Run Length
		while(sc.hasNext()){
			char[] c=sc.nextLine().toCharArray();
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<c.length; i++){
				if(c[i]=='@'){
					for(int j=0; j<Character.digit(c[i+1], 10); j++)	sb.append(c[i+2]);
					i+=2;
				}else	sb.append(c[i]);
			}
			out.println(sb.toString());
		}
	}
	
	void AOJ0064(){	// Secret Number
		int ans=0;
		while(sc.hasNext()){
			Matcher m = Pattern.compile("\\d+").matcher(sc.nextLine());
			while(m.find())	ans+=Integer.parseInt(m.group());
		}
		out.println(ans);
	}
	
	void AOJ0050(){	// Apple and Peach
		while(sc.hasNext()) out.println(sc.nextLine().replaceAll("apple", "PEACH").replaceAll("peach", "apple").replaceAll("PEACH", "peach"));
	}
	
	void AOJ0039(){	// Roman Figure ローマ数字 -> 10進数
		HashMap<Character,Integer> dic = new HashMap<Character,Integer>();
		dic.put('I', 1);	dic.put('V', 5);	dic.put('X', 10);	dic.put('L', 50);
		dic.put('C', 100);	dic.put('D', 500);	dic.put('M', 1000);
		while(sc.hasNext()){
			char[] c = sc.next().toCharArray();
			int ans=0,last=dic.get(c[0]);
			for(int i=0; i<c.length; i++){
				if(last>=dic.get(c[i])){
					ans+=dic.get(c[i]);
					last=dic.get(c[i]);
				}else{
					ans+=dic.get(c[i])-last-last;
					last=dic.get(c[i]);
				}
			}
			out.println(ans);
		}
	}
	
	void AOJ0020(){	// Capitalize 大文字変換
		while(sc.hasNext())	out.println(sc.nextLine().toUpperCase());
	}
}