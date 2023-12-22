import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-->0) {
			char[] num = in.next().toCharArray();
			Arrays.sort(num);
			String mx = "";
			String mn = "";
			for(int i = 0; i < num.length; i++) {
				mn+=num[i];
				mx+=num[num.length-i-1];
			}
			System.out.println(Integer.parseInt(mx)-Integer.parseInt(mn));
		}
	}
}