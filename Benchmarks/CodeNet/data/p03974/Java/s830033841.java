import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
	//char[] charlist = {'a','b','c','d','e',''}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] s = new String[n];
		for(int i=0;i<n;i++){
			s[i] = in.next();
		}
		int q = in.nextInt();
		for(int i=0;i<q;i++){
			int k = in.nextInt();
			String p = in.next();
			int[] alpha = new int[26];
			for(int j=0;j<26;j++){
				alpha[p.charAt(j)-'a'] = j;
			}
			String[] news = new String[n];
			for(int j=0;j<news.length;j++){
				StringBuilder sb = new StringBuilder();
				for(int t=0;t<s[j].length();t++){
					int temp = s[j].charAt(t)-'a';
					temp = alpha[temp] +'a' ;
					char newch = (char)(temp);
					sb.append(newch);
				}
				news[j] = sb.toString(); 
			}
			//sort it
			String com = news[k-1];
			Arrays.sort(news);
			for(int j=0;j<news.length;j++){
				if(news[j].equals(com)){
					System.out.println(j+1);
					break;
				}
					
			}
		}
	}
}
