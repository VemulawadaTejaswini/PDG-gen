
class test {
	public static int solve(int a,int b) {
			 for(int i=(a<=b)?a:b;i>=1;i--){
						if(a%i==0 && b%i==0) return i;
					}
					return 1;
		}
		
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int a=cin.nextInt(),b=cin.nextInt();
		System.out.println(solve(a,b));
	}
}
