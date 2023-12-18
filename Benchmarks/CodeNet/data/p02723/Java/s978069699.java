public class Main {
    public static void main(String[] args) {
		String input = args[0];		//入力から文字列取得
 
		if ((input.charAt(2)==input.charAt(3)) &&
			(input.charAt(4)==input.charAt(5))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

    }
}