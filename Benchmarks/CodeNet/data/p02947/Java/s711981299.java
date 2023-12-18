import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int N = sc.nextInt();
		String[] words = new String[N];
		for(int i=0;i<N;i++){
			String s = sc.next();
			char[] c = s.toCharArray();
			Arrays.sort(c);
			s = new String(c);
				for(int j=0;j<words.length;j++){
					if(s.equals(words[j])){
						count++;
					}else if(words[j] == null){
						words[j] = s;
						break;
					}
				}
		}
			System.out.println(count);
			sc.close();
	}
}