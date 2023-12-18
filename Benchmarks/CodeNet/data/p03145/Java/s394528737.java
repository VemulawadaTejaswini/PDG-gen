

class Main{
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// get a integer
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int total = getAreaTriangle(num1,num2);
		
		System.out.println(total);
	}
	
	public static boolean isMaxNum(int num) {
		return num > 100 ? true : false;
	}
	
	
	public static int getAreaTriangle(int num1,int num2) {
		
		if(isMaxNum(num1) || isMaxNum(num2) ) {
			return 0;
		}
		
		return  (num2 * num1) / 2; 
	}
	
}
