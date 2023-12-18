import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		sc.close();
		String[] slist = new String[len];
		for (int i=0; i<len; i++){
			slist[i] = String.valueOf(s.charAt(i));			
		}
		
		int start = 0;
		int end = 0;
		int ans = 0;
		boolean first = true;
		
		for (int i=0; i<len; i++){
			if(first && (slist[i].equals("A") || slist[i].equals("T") || slist[i].equals("G") || slist[i].equals("C"))){
				start = i;
				first = false;
			}
			else if (!first && !slist[i].equals("A") && !slist[i].equals("T") && !slist[i].equals("G") && !slist[i].equals("C")){
				end = i;
				first = true;
			}
			ans = Math.max(ans, end-start);
		}
		if(!first) ans = Math.max(ans, len -start);
		System.out.println(ans);
	}
}
