
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char []s = new char[S.length()];
        for(int i=0; i<S.length(); i++) {
        	s[i] = S.charAt(i);
        }

        char []alphabet = new char[26];
        char c = 'A';
        for (int i = 0; i < 26; i++){
            alphabet[i] = c++;
        }

        for(int i=0; i<S.length(); i++) {
        	for(int j=0; j<26; j++) {
        		if(s[i] == alphabet[j]) {
        			if(j+N<26) {
        				s[i] = alphabet[j+N];
        				break;
        			}else {
        				s[i] = alphabet[j+N-26];
        				break;
        			}
        		}
        	}

        }

        for(int i=0; i<S.length(); i++) {
        	System.out.print(s[i]);
        }



    }
}




