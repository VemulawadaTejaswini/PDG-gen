import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main
{
		public static void main(String[] args) throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String s;
			while((s=br.readLine())!=null)
			{
				int caesar = 0;
				char[] cipher = s.toCharArray();
				
			find : for (int i = 0; i < cipher.length - 5; i++) {
					int first = cipher[i] - cipher[i+1];
					if(first<0) first+=26;
					if( first== 't'-'h'){
						int sec = cipher[i+1] - cipher[i+2];
						int third = cipher[i+2] - cipher[i+3];
						if(sec<0) sec+=26;
						if(third>0) third-=26;
						if( sec == 'h'-'e') {
							caesar = Math.abs(cipher[i] - 't');
							break find;
						} else if(sec == 'h' - 'i' && third == 'i' - 's') {
							caesar = Math.abs(cipher[i] - 't');
							break find;
						} else if(sec == 'h' - 'a' && third == 'a' - 't') {
							caesar = Math.abs(cipher[i] - 't');
							break find;
						}
					}
			}
				char[] key = new char[26];
				for(int k =0; k< 26; k++)
					key[(caesar+k)%26] = (char)('a'+k);
				// decryption
				for (int j = 0; j < cipher.length; j++) {
					if(Character.isLowerCase(cipher[j])) cipher[j] = key[cipher[j]-97];
					System.out.print(cipher[j]);
				}
				System.out.println();
			}
		}
}