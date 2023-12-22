import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] s = str.split(" ");
		int[] n = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			n[i] = Integer.parseInt(s[i]);
		}
		if(n.length > 3){
			System.exit(0);
		}
		int a = n[0];
		int b = n[1];
		int c = n[2];
		
		if(a == b && b == c && a == 0){
			System.out.println(1);
			System.exit(0);
		}
		
		int count = 0;
		if(1 <= a && a <= 10000 && 1 <= b && b <= 10000 && 1 <= c && c <= 10000 && a <= b ) {
			for (int i = a; i < b; i++) {
				if (c % i == 0) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}