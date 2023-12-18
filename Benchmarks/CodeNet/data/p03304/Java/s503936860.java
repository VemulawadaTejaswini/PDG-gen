	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		d = scan.nextInt();
	
		int num[] = new int[m];
		array(num,0);
		System.out.println(count / Math.pow(n, m));
		scan.close();
	
	}
	
	public static Object array(int[] num,int s) {
		if(s == m) {
			for(int k = 0;k < m-1;k++) {
				if(Math.abs(num[k] - num[k+1]) == d) {
					count++;
				}
			}
		}else {
			for(int i = 0;i < n;i++) {
				num[s] = i+1;
				array(num,s+1);
			}
		}
		
		return null;
	}
}