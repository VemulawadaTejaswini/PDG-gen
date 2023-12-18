import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int[] mojicountR = new int[26];
		int[] mojicountL = new int[26];
		int len;
		int tmax = 0,max = 0;
		String str = new String();
		Scanner scan = new Scanner(System.in);

		for(int i = 0;i < 26;i++) {
			mojicountR[i] = 0;
			mojicountL[i] = 0;
		}

		len = scan.nextInt();
		str = scan.next();

		for(int i = 0;i < len;i++) {
			mojicountR[str.charAt(i) - 97]++;
		}

		for(int i = 0;i < len;i++) {

			if(--mojicountR[str.charAt(i) - 97] == 0) {
				tmax--;
			}
			if(++mojicountL[str.charAt(i) - 97] == 1) {
				tmax++;
			}

			max = getmax(max,tmax);
		}

		System.out.println(max);

		scan.close();

	}

	public static int getmax(int x,int y) {
		return x > y ? x : y ;
	}

	public static int getmin(int x,int y) {
		return x > y ? y : x;
	}

}