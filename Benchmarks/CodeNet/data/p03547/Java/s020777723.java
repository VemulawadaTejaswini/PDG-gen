	public static void Main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String X = scan.next();
		char x = X.charAt(0);
	
		String Y = scan.next();
		char y = Y.charAt(0);
		if(x>y){
			System.out.println(">");
		}else if(X == Y){
			System.out.println("=");
		}else{
			System.out.println("<");
		}
		
	}
