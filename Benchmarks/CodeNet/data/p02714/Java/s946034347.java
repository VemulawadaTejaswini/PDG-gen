import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		char[] rgb = scan.next().toCharArray();
		scan.close();
		
		int numR = 0;
		int numG = 0;
		int numB = 0;
		for(char c : rgb) {
			switch(c) {
			case 'R' : numR++; break;
			case 'G' : numG++; break;
			case 'B' : numB++; break;
			}
		}

		long ans = numR*numG*numB;
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(rgb[i] != rgb[j]) {
					if(2*j-i < n && rgb[2*j-i] != rgb[i] && rgb[2*j-i] != rgb[j])
						ans--;
				}
			}
		}
		
		System.out.println(ans);
	}
}