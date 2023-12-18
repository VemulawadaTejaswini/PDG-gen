import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int[] num = new int[c.length];
		for(int n = 0; n < c.length;n++) {
			num[n] = c[n] - '0';
		}
		if((num[0]+num[1]+num[2]+num[3])==7) {
			System.out.println(num[0] + "+"+ num[1]+"+"+num[2]+"+"+num[3]+"=7");
		}
		else if((num[0]+num[1]+num[2]-num[3])==7) {
			System.out.println(num[0] + "+"+ num[1]+"+"+num[2]+"-"+num[3]+"=7");
		}
		else if((num[0]+num[1]-num[2]+num[3])==7) {
			System.out.println(num[0] + "+"+ num[1]+"-"+num[2]+"+"+num[3]+"=7");
		}
		else if((num[0]+num[1]-num[2]-num[3])==7) {
			System.out.println(num[0] + "+"+ num[1]+"-"+num[2]+"-"+num[3]+"=7");
		}
		else if((num[0]-num[1]+num[2]+num[3])==7) {
			System.out.println(num[0] + "-"+ num[1]+"+"+num[2]+"+"+num[3]+"=7");
		}
		else if((num[0]-num[1]+num[2]-num[3])==7) {
			System.out.println(num[0] + "-"+ num[1]+"+"+num[2]+"-"+num[3]+"=7");
		}
		else if((num[0]-num[1]-num[2]+num[3])==7) {
			System.out.println(num[0] + "-"+ num[1]+"-"+num[2]+"+"+num[3]+"=7");
		}
		else if((num[0]-num[1]-num[2]-num[3])==7) {
			System.out.println(num[0] + "-"+ num[1]+"-"+num[2]+"-"+num[3]+"=7");
		}
	}
}
