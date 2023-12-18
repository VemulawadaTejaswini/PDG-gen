import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//n
		String s = scanner.nextLine();
		String p = scanner.nextLine();
		char[] slist = new char[s.length()];
		char[] plist = new char[p.length()];
		int[] sslist = new int[s.length()];
		int[] pplist = new int[p.length()];


		for(int i = 0; i < s.length(); i++) {
			slist[i] = s.charAt(i);
			plist[i] = p.charAt(i);
			for(int j = 1; j < i; j++) {
				if(slist[j] == slist[i]) {
					sslist[j]++;
				}
				if(plist[j] == plist[i]) {
					pplist[j]++;
				}
			}
		}

		int flag = 0;

		for(int i = 0; i < s.length(); i++) {
			if(sslist[i] != pplist[i]) {
				flag++;
				break;
			}
		}

		if(flag == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}
}
