class Main{

	public static void main(String[] args){

	int a = 0;
	int b = 0;
	
	Scanner scan = new Scanner(System.in);
	
	int val = scan.nextInt();
	a = val;
	
	val = scan.nextInt();
	b = val;
	
	System.out.print((a * b) + " " + ((a + b) * 2));
	}
}