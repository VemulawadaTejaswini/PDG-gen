public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
        String N = scan.nextLine();
        scan = new Scanner(System.in);
        String S= scan.nextLine();
        int n = Integer.parseInt(N);
        int cnt = 0;
		for (int i=1; i < n-1; i++)
			for (int j=i+1; j <  n; j++)
				for (int k=j+1; k < n+1; k++)
					if ((j-i) != (k-j)
						&& S.charAt(i-1)!=S.charAt(j-1)
						&& S.charAt(i-1)!=S.charAt(k-1)
						&& S.charAt(j-1)!=S.charAt(k-1)
						)
						cnt++;
		System.out.println(cnt);
	}