import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		List<String> m = new ArrayList<String>();
		String memo="";
		for(int s=0;s<n.length();s++){
			if(n.charAt(s)==' '||n.charAt(s)==','||n.charAt(s)=='.'){
				if(memo.length()!=0&&memo.length()>=3&&memo.length()<=6)m.add(memo);
				memo="";
				continue;
			}
			memo+=n.charAt(s);
		}
		for(int i=0;i<m.size()-1;i++)System.out.print(m.get(i)+" ");
		System.out.println(m.get(m.size()-1));
	}
}