import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
		int len = s.length();
		sc.close();

		for(int i=0;i<len;i++){
			char ch = s.charAt(i);
			int sub = (int)('z'-ch)+1;
			if(ch == 'a') continue;
			if(sub<=k){
				k -= sub;
				s = insertStr(s,i,'a');
			}
		}
		if(k>0) {
			k %= 26;
			s = insertStr(s,len-1,(char)(s.charAt(len-1)+k));
		}
		System.out.println(s);
	}
	public static String insertStr(String str,int i,char c){
		return str.substring(0,i)+c+str.substring(i+1,str.length());
	}

}