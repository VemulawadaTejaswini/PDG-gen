import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int days = sc.nextInt();
			char[] resp = sc.next().toCharArray();

			int[][] s = new int[2][7]; // scheduleCount
			s[0][0] = 1;
			final int d = 10007; // divider

			int p = 0; // previous
			for(int i = 0; i < days; i++) {
				p = (i + 1) % 2;
				final int c = i%2; // cursor
				switch(resp[i]) {
				case 'J':
			s[p][0]=(s[c][0]+s[c][1]+s[c][2]+s[c][6])%d;
			s[p][1]=(s[c][0]+s[c][1]+s[c][2]+s[c][4]+s[c][5]+s[c][6])%d;
			s[p][2]=(s[c][0]+s[c][1]+s[c][2]+s[c][3]+s[c][4]+s[c][6])%d;
					break;
				case 'O':
			s[p][2]=(s[c][0]+s[c][1]+s[c][2]+s[c][3]+s[c][4]+s[c][6])%d;
			s[p][3]=(s[c][2]+s[c][3]+s[c][4]+s[c][6])%d;
			s[p][4]=(s[c][1]+s[c][2]+s[c][3]+s[c][4]+s[c][5]+s[c][6])%d;
					break;
				case 'I':
			s[p][1]=(s[c][0]+s[c][1]+s[c][2]+s[c][4]+s[c][5]+s[c][6])%d;
			s[p][4]=(s[c][1]+s[c][2]+s[c][3]+s[c][4]+s[c][5]+s[c][6])%d;
			s[p][5]=(s[c][1]+s[c][4]+s[c][5]+s[c][6])%d;
					break;
				}
		s[p][6]=(s[c][0]+s[c][1]+s[c][2]+s[c][3]+s[c][4]+s[c][5]+s[c][6])% d;
				s[c] = new int[8];
			}
			int sum = 0;
			for(int sch :s[p]) {
				sum += sch;
			}
			System.out.println(sum % d);
		}
	}
}
