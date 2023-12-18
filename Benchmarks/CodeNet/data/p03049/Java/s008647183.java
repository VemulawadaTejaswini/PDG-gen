import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String[] str = new String[N];
		int a = 0, b = 0, c = 0;
		
		for(int i = 0; i < N; i++) {
			str[i] = sc.next();
			
			for(int j = 0; j < str[i].length()-1; j++) {
				if((str[i].charAt(j) + "" + str[i].charAt(j+1)).equals("AB")) {
					c++;
				}
			}
			
			if(str[i].endsWith("A")) a++;
			if(str[i].startsWith("B")) b++;
			
		}

		System.out.println(c + Math.min(a, b));
		
	}
}
