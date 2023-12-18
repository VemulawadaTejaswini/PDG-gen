public class Main{
	public static void main(String[] args){
		int ans = Integer.parseInt(args[1]) + Integer.parseInt(args[0]);
		if(ans >= 24)
			ans %= 24;
		System.out.println(ans);
	}
}
