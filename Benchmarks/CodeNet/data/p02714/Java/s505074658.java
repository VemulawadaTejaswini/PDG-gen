import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		char[] rgb = scan.next().toCharArray();
		scan.close();
		
		long ans = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int k = j+1; k < n; k++) {
					if(rgb[i] != rgb[j] && rgb[j] != rgb[k] && rgb[k] != rgb[i] && j-i != k-j)
						ans++;
				}
			}
		}
		
		System.out.println(ans);
	}

}
