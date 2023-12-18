public class Main{
	public static void main(String[] args){
	int ans =Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
	System.out.print(ans %= 24);
	}
}
