import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		long ans = 0;

		for (int i=1; i*2019 <= 200000; i++){
			String val = String.valueOf(i * 2019);
			if (val.contains("0")){
				continue;
			}
			int pos = 0;
			while (s.indexOf(val, pos) >= 0){
				ans++;
				pos = s.indexOf(val, pos) + 1;
			}
		}
		System.out.println(ans);
	}
}