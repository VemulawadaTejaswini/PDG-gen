public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		String[] str = new String[5];
		int[] prs = new int[5];
		for (int i=0; i<5; i++) {
			str[i] = in.next();
			prs[i] = java.lang.Integer.parseInt(str[i]);
		}
		int tmp1 = 2000, tmp2 = 2000;
		for (int i=0; i<5; i++) {
			if(i<3) {
				if (prs[i] <tmp1)
					tmp1 = prs[i];
			}
			else if(i<5) {
				if (prs[i] < tmp2)
					tmp2 = prs[i];
			}
		}
		System.out.println(tmp1+tmp2-50);
	}
}