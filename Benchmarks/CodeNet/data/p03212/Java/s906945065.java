import java.util.Scanner;


public class ABC114C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		
		int ans = 0;
		for(long i = 357;i <= N;) {
			String s = String.valueOf(i);
			boolean flag7 = false, flag5 = false, flag3 = false;
			for(int j = 0;j < s.length();++j) {
				switch(Integer.parseInt(s.substring(j, j+1))) {
				case 7:
					flag7 = true;
					break;
				case 5:
					flag5 = true;
					break;
				case 3:
					flag3 = true;
					break;
				default:
					flag7 = false;
					j = s.length();
					break;
				}
			}
			if(flag7 && flag5 && flag3)
				ans++;
			switch((int)(i % 10)) {
			case 7:
				i += 6;
				break;
			case 5:
			case 3:
				i += 2;
				break;
			}
		}
		System.out.println(ans);
	}
}