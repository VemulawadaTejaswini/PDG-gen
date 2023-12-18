public class Libra{
	
	public static void main(String[] args){
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c = Integer.valueOf(args[2]);
		int d = Integer.valueOf(args[3]);

		if (a+b>c+d){
			System.out.println("Left");
		}else if(a+b<c+d){
			System.out.println("Right");
		}else{
			System.out.println("Balanced");
		}
	}
	
	
}