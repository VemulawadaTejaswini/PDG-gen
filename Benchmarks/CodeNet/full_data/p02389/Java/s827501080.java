public class Main {

	public static void main(String[] args) {
		String input = new java.util.Scanner(System.in).nextLine(); 
		String[] inputAry = input.split(" ");
		int a = Integer.parseInt(inputAry[0]);
		int b = Integer.parseInt(inputAry[1]);
		int mennseki = a * b;
		int nagasa = (a + b) * 2;
		System.out.println(mennseki + " " + nagasa);
	}
}