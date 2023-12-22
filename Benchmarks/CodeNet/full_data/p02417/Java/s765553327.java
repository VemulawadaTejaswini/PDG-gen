import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			int cnt[] = new int[26];
			int i;
			char c;
			for( i=0; i<26; i++ ){
				cnt[i] = 0;
			}
			while((str = br.readLine())!=null){
				for( i=0; i<str.length(); i++ ){
					c = str.charAt(i);
					if('A'<=c && c<='Z') cnt[c-'A']++;
					if('a'<=c && c<='z') cnt[c-'a']++;
				}
			}
			for( i=0; i<26; i++ ){
				c = (char)('a' + i);
				System.out.println( c + " : " + cnt[i] );
			}
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
}