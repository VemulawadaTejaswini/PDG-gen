import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		char[] ch = s.toCharArray();
		int cnt = 0;
		for(int i = 0;i < s.length()-1;i++){
			if(ch[i]==ch[i+1]){
				i++;
			}
			cnt++;
		}
		System.out.println(cnt+1);
	}
}