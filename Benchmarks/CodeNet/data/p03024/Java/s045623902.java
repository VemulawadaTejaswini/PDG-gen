import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "NO";
		String[] SS = s.split("");
		int cnt = 0;
		for(int i = 0; i < SS.length; i++) {
			if(SS[i].equals("o")) {
				cnt ++;
			}
		}
		if(15 - SS.length + cnt >= 8) {
			ans = "YES";
		}
		System.out.println(ans);
		sc.close();
	}
	
    
}
