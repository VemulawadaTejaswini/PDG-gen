public class Main {
	public static void main(String[] args){
		int x = Integer.valueOf(args[0]);
		int a = Integer.valueOf(args[1]);
		int b = Integer.valueOf(args[2]);
		
		if(a-b >= 0){
			System.out.println("delicious");
		}
		else{
			if(Math.abs(a-b)<=x){
				System.out.println("safe");
			}
			else{
				System.out.println("dangerous");
			}
		}
	}
}