import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ",0); 
		String check="";
		int[] alph = new int[26];
		int len = str.length;
		for(int i=0;i<len;i++){
			for(int j=0;j<str[i].length();j++){
				check =String.valueOf(str[i].charAt(j));
				if(check.matches("[a-z]+")){
					alph[str[i].charAt(j)-'a']++;
				}else if(check.matches("[A-Z]+")){
					alph[str[i].charAt(j)-'A']++;
				}
				
			}
		}
		for(int i=97;i<123;i++)
			System.out.println((char)i+" : "+alph[i-97]);
	}
}