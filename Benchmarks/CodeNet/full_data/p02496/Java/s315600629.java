public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		String str1 = in.next();
		int n = java.lang.Integer.parseInt(str1);
		int[][] num = new int[4][13];
		for(int i = 0; i < n; i++) {
			String str2 = in.next();
			String str3 = in.next();
			int tmp = java.lang.Integer.parseInt(str3);
			if(str2.equals("S"))
				num[0][tmp -1] = 1;
			if(str2.equals("H"))
				num[1][tmp -1] = 1;
			if(str2.equals("C"))
				num[2][tmp -1] = 1;
			if(str2.equals("D"))
				num[3][tmp -1] = 1;
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				if(num[i][j] == 0) {
					if(i == 0)
						System.out.println("S " + (j +1));
					if(i == 1)
						System.out.println("H " + (j +1));
					if(i == 2)
						System.out.println("C " + (j +1));
					if(i == 3)
						System.out.println("D " + (j +1));
				}
			}
		}
	}
}