import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		String[] s1 = str1.split("");
		String[] s2 = str2.split("");
		int temp = -1;
		
		for(int i=0; i<s2.length; i++) {
			if(s1[0].equals(s2[i])) {
				temp = i;
				break;
			}
		}
		
		if(temp == -1) {
			System.out.println("No");
			return;
		}
      
		temp++;
		for(int i=1; i<s2.length; i++) {
			if(temp == s2.length) {
				temp = 0;
			}
			if(!s1[i].equals(s2[temp])) {
				System.out.println("No");
				return;
			}
			temp++;
		}
		
		System.out.println("Yes");
	}

}