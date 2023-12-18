public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	int K = scan.nextInt();
	int A = scan.nextInt();
	int B = scan.nextInt();
	
	if (2*K) <= A && (2*K) >= B {
	System.out.print("OK");
	}else{
	System.out.print("NG");
	}
	  
}