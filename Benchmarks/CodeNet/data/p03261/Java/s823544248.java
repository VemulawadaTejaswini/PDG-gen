import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] words = new String[N];
		for(int i = 0;i < N;++i)
			words[i] = sc.next();
		sc.close();
		
		boolean flag = true;
		for(int i = 1;i < N;++i) {
			for(int j = 0;j < i;++j) {
				if(words[j].equals(words[i])) {
					flag = false;
					break;
				}
			}
			if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
				flag = false;
				break;
			}
		}
		
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
