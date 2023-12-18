import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int count2 = 0;
		int ans = 0;
		int n = sc.nextInt();
		String str = sc.next();
		String[] s = str.split("0{2,}", 0);
//		debug(s);
		
		for(int i = 0; i < s.length; i++) {
			String[] s2 = s[i].split("101", -1);
	
			if(s2.length != 1) {
				for(int j = 0; j < s2.length; j++) {
					if(s2[j].startsWith("1")) {
						debug(s2[j]);
						for(char x: s2[j].toCharArray()){
							if(x == '1'){
								count++;
							}
						}
						if(count > count2) count2 = count;
						count = 0;
					}
				}
			}
			ans += count2 + s2.length - 1;
			count = count2 = 0;
		}
		System.out.println(ans);
		
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
