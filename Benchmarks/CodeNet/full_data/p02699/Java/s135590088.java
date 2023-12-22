public class Main {

	public static void main(String[] args) {
		int sheep = 0;
		int worf = 0;
		
		try {
			sheep = Integer.parseInt(args[0]);
			worf = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("入力値が数値と解釈できません。");
		}
		
		if(sheep >= 1 && sheep <= 100 & worf >= 1 && worf <= 100) {
			if(sheep > worf) {
				System.out.println("safe");
			} else if (sheep <= worf) {
				System.out.println("unsafe");
			}
		}
	}

}