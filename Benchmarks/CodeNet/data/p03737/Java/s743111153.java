public class Main {

	public static void main(String[] args) {
		String moji_one = args[0].substring(0,1);
		String moji_second = args[1].substring(0,1);
		String moji_third = args[2].substring(0,1);
		
		String answer = moji_one.toUpperCase() + moji_second.toUpperCase() + moji_third.toUpperCase();
		System.out.println(answer);
		
		
	}

}