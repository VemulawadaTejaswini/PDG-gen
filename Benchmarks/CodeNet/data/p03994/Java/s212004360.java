import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int K = in.nextInt();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			Character tmp = s.charAt(i);
			if (i<len-1&&26-(tmp-'a')<K) {
				s = s.substring(0, i)+'a'+s.substring(i+1,len);
				K -= 26-(tmp-'a');
			}
				if (i==len-1) {
					K = K%26;
					if (tmp+K>'z') {
						tmp = (char) (tmp+K-26);
					}else {
						tmp = (char) (tmp +K);
					}					
					s = s.substring(0,len-1)+tmp;
				}
			
		}
		System.out.println(s);
	}
}
