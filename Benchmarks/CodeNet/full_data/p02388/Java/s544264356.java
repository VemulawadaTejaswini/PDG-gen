public class Cubic {

	
	public static void main(String[] args) {
		int result = 0;
		// TODO Auto-generated method stub
		System.out.println("Enter the x value ");
		Scanner input = new Scanner(System.in);
		int x=input.nextInt();
		
		if(x >=1 && x<=100){
		result = x*x*x;
			System.out.println("X cubic value"+result);
	}
		else{
			System.out.println("Your input must between 1 and 100!");
		}
	}
		
}