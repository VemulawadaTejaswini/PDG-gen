import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			String S = scan.next();

			char[]s = S.toCharArray();

			Map<Character,Integer>map = new TreeMap<Character,Integer>();

			for(int i = 0;i<26;i++) {
				char a = (char)('a'+i);
				map.put(a, 0);
			}

			for(int i = 0;i<S.length();i++) {
				map.put(s[i],1);
			}


			String P = S;

			int one = 1;
			int count = 0;

			for(char key:map.keySet()) {
				int z = map.get(key);
				if(z==0&&one==1) {
					P = P+String.valueOf(key);
					one--;
				}
				if(z==1)count++;


			}

			int num = 0;
			char an = 'a';

			if(count==26) {
				if(S.equals("zyxwvutsrqponmlkjihgfedcba")) {
					System.out.println(-1);
					return;
				}else {
					for(int i = S.length()-2;i>=0;i--) {
						if(i==S.length()-2) {
							an=s[i+1];
						}

						if(s[i]<s[i+1]) {
							num=i;
							break;
						}
					}

					StringBuffer sb = new StringBuffer();
					for(int i = 0;i<num;i++) {
						sb.append(s[i]);
					}

					sb.append(an);

					System.out.println(sb.toString());
					return;

				}
			}




			if(S.equals(P)) {
				System.out.println(-1);
			}else {
				System.out.println(P);
			}





		}


	}


}
