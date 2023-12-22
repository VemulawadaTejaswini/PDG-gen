class Main{public static void main(String[] args)
			throws java.io.IOException{
		 BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String n=d.readLine();
		System.out.print(fact(Integer.parseInt(n)));
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	public static long fact(int n){
		if(n==0) return 1;
		return n*fact(n-1);
}