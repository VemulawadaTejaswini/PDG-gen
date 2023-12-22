import java.util.Scanner;

class Calculate{
  
	public static int calc() {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int total=0;
		
		total=num+(num*num)+(num*num*num);
		
		return total;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println(calc());;
	}
}